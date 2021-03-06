package com.liqi.mapstruct.pojo;

import java.util.Date;

/**
 * @author Sky
 * create  2021-03-09 15:34
 * email sky.li@ixiaoshuidi.com
 */
public class Employee {
    private int id;
    private String name;
    private Division division;
    private Date startDt;


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

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Date getStartDt() {
        return startDt;
    }

    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }
}
