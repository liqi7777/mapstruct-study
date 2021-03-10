package com.liqi.mapstruct.pojo;

/**
 * @author Sky
 * create  2021-03-09 17:03
 * email sky.li@ixiaoshuidi.com
 */
public class TransactionDTO {

    private String uuid;
    private Long totalInCents;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getTotalInCents() {
        return totalInCents;
    }

    public void setTotalInCents(Long totalInCents) {
        this.totalInCents = totalInCents;
    }
}
