package com.liqi.mapstruct.pojo;

/**
 * @author Sky
 * create  2021-03-09 15:33
 * email sky.li@ixiaoshuidi.com
 */
public class EmployeeDTO {
    private int employeeId;
    private String employeeName;
    private DivisionDTO division;
    private String employeeStartDt;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public DivisionDTO getDivision() {
        return division;
    }

    public void setDivision(DivisionDTO division) {
        this.division = division;
    }

    public String getEmployeeStartDt() {
        return employeeStartDt;
    }

    public void setEmployeeStartDt(String employeeStartDt) {
        this.employeeStartDt = employeeStartDt;
    }
}
