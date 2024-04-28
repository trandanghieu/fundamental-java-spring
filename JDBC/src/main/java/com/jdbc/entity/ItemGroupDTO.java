package com.jdbc.entity;

public class ItemGroupDTO {
    private Integer igId;
    private String igName;
    private Integer numOfItems;

    public ItemGroupDTO(){

    }

    public ItemGroupDTO(Integer igId, String igName, Integer numOfItems) {
        this.igId = igId;
        this.igName = igName;
        this.numOfItems = numOfItems;
    }

    public Integer getIgId() {
        return igId;
    }

    public void setIgId(Integer igId) {
        this.igId = igId;
    }

    public String getIgName() {
        return igName;
    }

    public void setIgName(String igName) {
        this.igName = igName;
    }

    public Integer getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(Integer numOfItems) {
        this.numOfItems = numOfItems;
    }

    @Override
    public String toString() {
        return "\n ItemGroupDTO{" +
                "igId=" + igId +
                ", igName='" + igName + '\'' +
                ", numOfItems=" + numOfItems +
                '}';
    }
}
