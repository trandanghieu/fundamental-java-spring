package com.jdbc.dao;

import com.jdbc.connection.DbManager;
import com.jdbc.entity.ItemGroup;
import com.jdbc.entity.ItemGroupDTO;
import com.jdbc.utils.SqlUtils;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
    1.Write a native query
    2.Execute the native query and return data
        2.1. Initial Statement or PrepareStatement object
        2.2. Set native query into statement
        2.3. Call executeQuery or executeUpdate to execute native query

    SQL Injection:
    SELECT * FROM LoaiHang;
 */

public class ItemGroupDAOImpl implements ItemGroupDAO {
    private Connection connection;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;

    @Override
    public List<ItemGroup> get(String name) {
        List<ItemGroup> result = new ArrayList<>();
        String sql = "SELECT * FROM LoaiHang \n"
                    + "WHERE TenLH = ?";

        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1,name);
            rs = pst.executeQuery();
            while (rs.next()){
                result.add(new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH")));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            SqlUtils.close(rs,pst);
        }
        return result;
    }

    public ItemGroupDAOImpl() {
        connection = DbManager.getConnection();
    }

    @Override
    public boolean save(ItemGroup itemGroup) {
        boolean isSave = false;
        String sql = "INSERT INTO LoaiHang(MaLH,TenLH) \n"
                + "VALUES(" + itemGroup.getId() + ",'" + itemGroup.getName() + "')";
        try {
            st = connection.createStatement();
            int affectedRows = st.executeUpdate(sql);

            isSave = affectedRows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(st);
        }
        return isSave;
    }

    public ItemGroup get(int id) {
        ItemGroup result = null;
        String sql = "SELECT * FROM LoaiHang \n"
                + "WHERE MaLH =" + id;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                result = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(rs, st);
        }
        return result;
    }

    public List<ItemGroup> getAll() {
        List<ItemGroup> result = new ArrayList<>();
        String sql = "SELECT * FROM LoaiHang";
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Integer id = rs.getInt("MaLH");
                String name = rs.getString("TenLH");
                ItemGroup itemGroup = new ItemGroup(id, name);
                result.add(itemGroup);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(rs, st);
        }
        return result;
    }


    @Override
    public boolean update(ItemGroup itemGroup) {
        boolean isUpdate = false;
        String sql = "UPDATE LoaiHang \n"
                     +" SET TenLH = ? \n"
                     +"WHERE MaLH = ?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, itemGroup.getName());
            pst.setInt(2,itemGroup.getId());

            int affectedRows = pst.executeUpdate();
            isUpdate = affectedRows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(pst);
        }
        return isUpdate;
    }

    @Override
    public boolean saveOrUpdate(ItemGroup itemGroup) {
        return get(itemGroup.getId()) == null ? save(itemGroup) : update(itemGroup);
    }

    @Override
    public List<ItemGroupDTO> getItemsByItemGroupId() {
        List<ItemGroupDTO> itemGroupDTOList = new ArrayList<>();

        String sql = "SELECT lh.*, COUNT(*) AS SoLuongMatHang \n" +
                     "FROM mathang mh \n" +
                     "JOIN loaihang lh \n" +
                     "  ON mh.MaLH = lh.MaLH \n"+
                     "GROUP BY lh.MaLH \n";
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Integer id = rs.getInt("MaLH");
                String name = rs.getString("TenLH");
                Integer quantity = rs.getInt("SoLuongMatHang");
                itemGroupDTOList.add(new ItemGroupDTO(id,name,quantity));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(rs, st);
        }

        return itemGroupDTOList;
    }
}
