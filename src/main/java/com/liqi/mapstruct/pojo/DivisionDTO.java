package com.liqi.mapstruct.pojo;

/**
 * @author Sky
 * create  2021-03-09 15:45
 * email sky.li@ixiaoshuidi.com
 */
public class DivisionDTO {
    private int id;
    private String name;

    public DivisionDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public DivisionDTO() {
    }

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
}
