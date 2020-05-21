package cn.felord.mybatis.entity;

import java.util.List;

/**
 * @author felord.cn
 * @since 15:33
 **/
public class DepartmentAndTypeEmployees extends Department {
    private static final long serialVersionUID = -2503893191396554581L;
    private List<RegularEmployee> regularEmployees;
    private List<TemporaryEmployee> temporaryEmployees;

    public List<RegularEmployee> getRegularEmployees() {
        return regularEmployees;
    }

    @Override
    public String toString() {
        return "DepartmentAndTypeEmployees{" +
                "regularEmployees=" + regularEmployees +
                ", temporaryEmployees=" + temporaryEmployees +
                '}';
    }

    public void setRegularEmployees(List<RegularEmployee> regularEmployees) {
        this.regularEmployees = regularEmployees;
    }

    public List<TemporaryEmployee> getTemporaryEmployees() {
        return temporaryEmployees;
    }

    public void setTemporaryEmployees(List<TemporaryEmployee> temporaryEmployees) {
        this.temporaryEmployees = temporaryEmployees;
    }
}
