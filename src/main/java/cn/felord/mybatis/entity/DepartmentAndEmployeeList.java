package cn.felord.mybatis.entity;

import java.util.List;

/**
 * @author felord.cn
 * @since 15:33
 **/
public class DepartmentAndEmployeeList extends Department {
    private static final long serialVersionUID = -2503893191396554581L;
    private List<RegularEmployee> employees;

    public List<RegularEmployee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "DepartmentAndEmployeeList{" +
                "employees=" + employees +
                "} " + super.toString();
    }

    public void setEmployees(List<RegularEmployee> employees) {
        this.employees = employees;
    }
}
