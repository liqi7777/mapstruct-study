package com.liqi.mapstruct.pojo;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author Sky
 * create  2021-03-09 17:02
 * email sky.li@ixiaoshuidi.com
 */
public class Transaction {
    private Long id;
    private String uuid = UUID.randomUUID().toString();
    private BigDecimal total;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
