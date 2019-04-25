package com.yinda.gbcommon.bean;

public class Device {
    private Long id;
    private String collar_code;
    private String remark1;
    private String remark2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollar_code() {
        return collar_code;
    }

    public void setCollar_code(String collar_code) {
        this.collar_code = collar_code;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }
}
