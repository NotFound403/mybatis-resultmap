package cn.felord.mybatis.entity;

import java.io.Serializable;

/**
 * @author felord.cn
 * @since 16:54
 **/
public class Department implements Serializable {
    private static final long serialVersionUID = 1230986161187676346L;
    private String departmentId;
    private String departmentName;
    private Integer departmentLevel;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentLevel=" + departmentLevel +
                '}';
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getDepartmentLevel() {
        return departmentLevel;
    }

    public void setDepartmentLevel(Integer departmentLevel) {
        this.departmentLevel = departmentLevel;
    }
}
