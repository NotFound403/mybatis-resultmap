package cn.felord.mybatis.entity;

import lombok.Data;

import java.io.Serializable;


/**
 * @author felord.cn
 * @since 16:50
 **/
@Data
public class Employee implements Serializable {
    private static final long serialVersionUID = -7145891282327539285L;
    private String employeeId;
    private String name;
    private String jobNumber;

}
