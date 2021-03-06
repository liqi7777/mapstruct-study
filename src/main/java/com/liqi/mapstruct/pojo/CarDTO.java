package com.liqi.mapstruct.pojo;

/**
 * @author Sky
 * create  2021-03-10 09:36
 * email sky.li@ixiaoshuidi.com
 */
public class CarDTO {
    private int id;
    private String name;
    private FuelType fuelType;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}
