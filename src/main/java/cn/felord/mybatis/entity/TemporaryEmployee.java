package cn.felord.mybatis.entity;

/**
 * @author felord.cn
 * @since 16:55
 **/

public class TemporaryEmployee extends Employee {
    private static final long serialVersionUID = 1079203515126502939L;
    private Integer companyNo;

    @Override
    public String toString() {
        return "TemporaryEmployee{" +
                "companyNo=" + companyNo +
                "} " + super.toString();
    }

    public Integer getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(Integer companyNo) {
        this.companyNo = companyNo;
    }
}
