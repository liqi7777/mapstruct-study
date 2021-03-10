package com.liqi.mapstruct.pojo;

import lombok.Data;

/**
 * @author Sky
 * create  2021-03-09 14:59
 * email sky.li@ixiaoshuidi.com
 */
public class SimpleSource {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
