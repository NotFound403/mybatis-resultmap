package cn.felord.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


/**
 * @author felord.cn
 * @since 16:50
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    private static final long serialVersionUID = -7145891282327539285L;
    private String employeeId;
    private String employeeName;
    private Integer employeeType;
}
