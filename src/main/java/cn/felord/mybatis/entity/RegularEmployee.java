package cn.felord.mybatis.entity;

/**
 * @author felord.cn
 * @since 16:56
 **/

public class RegularEmployee extends Employee {
    private static final long serialVersionUID = 6698521717779632645L;
    private Integer level;
    private String jobNumber;
    private Department department;

    public Integer getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "RegularEmployee{" +
                "level=" + level +
                ", jobNumber='" + jobNumber + '\'' +
                ", department=" + department +
                "} " + super.toString();
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
