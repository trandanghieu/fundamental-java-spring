package com.jdbc.dao;

import com.jdbc.connection.DbManager;
import com.jdbc.entity.Item;
import com.jdbc.entity.ItemGroup;
import com.jdbc.utils.DateUtils;
import com.jdbc.utils.SqlUtils;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {
    private Connection connection;
    private PreparedStatement pst;
    private ResultSet rs;

    public ItemDAOImpl(){
        connection = DbManager.getConnection();
    }

    @Override
    public List<Item> get(String igName) {
        List<Item> result = new ArrayList<>();
        String sql = "SELECT * \n"
                    +"FROM MatHang mh \n"
                    +"JOIN LoaiHang lh ON mh.MaLH = lh.MaLH \n"
                    +"WHERE lh.TenLh = ?";
        try {
            pst  = connection.prepareStatement(sql);
            pst.setString(1, igName);
            rs = pst.executeQuery();
            while(rs.next()) {
                Integer itemId = rs.getInt("MaMH");
                String name = rs.getString("TenMH");
                String color = rs.getString("MauSac");
                Integer itemGroupId = rs.getInt("MaLH");
                String itemGroupName = rs.getString("TenLH");

                ItemGroup itemGroup = new ItemGroup(itemGroupId,itemGroupName);
                Item item = new Item(itemId, name, color, itemGroup);

                result.add(item);
            }

        }catch (SQLException e){
            e.printStackTrace();

        }finally {
            SqlUtils.close(rs,pst);
        }

        return result;
    }

    @Override
    public List<Item> get(LocalDate orderDate) {
        List<Item> itemList = new ArrayList<>();
        String sql = "SELECT DISTINCT mh.* FROM MatHang mh\n" +
                     "JOIN ChiTietMatHang ctmh \n" +
                     "  ON  ctmh.MaMH = mh.MaMH\n" +
                     "JOIN ChiTietDonHang ctdh \n" +
                     "  ON ctdh.MaMH = ctmh.MaMH\n" +
                     "JOIN DonHang dh \n" +
                     "  ON dh.MaDH = ctdh.MaDH\t\n" +
                     "WHERE CAST(dh.ThoiGianDatHang AS DATE) = ?";
        try {
            pst  = connection.prepareStatement(sql);
            pst.setDate(1, DateUtils.toDate(orderDate));

            rs = pst.executeQuery();

            while(rs.next()) {
                itemList.add(new Item(rs.getInt("MaMH"),
                                      rs.getString("TenMH"),
                                      rs.getString("Mausac"),
                                      new ItemGroup()
                ));
            }

        }catch (SQLException e){
            e.printStackTrace();

        }finally {
            SqlUtils.close(rs,pst);
        }
        return itemList;
    }
}
