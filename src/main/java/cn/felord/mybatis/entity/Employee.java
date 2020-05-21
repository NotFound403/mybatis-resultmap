package cn.felord.mybatis.entity;

import java.io.Serializable;


/**
 * @author felord.cn
 * @since 16:50
 **/
public class Employee implements Serializable {
    private static final long serialVersionUID = -7145891282327539285L;
    private String employeeId;
    private String employeeName;
    private Integer employeeType;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeType=" + employeeType +
                '}';
    }

    public Employee(String employeeId, String employeeName, Integer employeeType) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeType = employeeType;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(Integer employeeType) {
        this.employeeType = employeeType;
    }
}
