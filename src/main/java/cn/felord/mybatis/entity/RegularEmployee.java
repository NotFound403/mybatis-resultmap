package cn.felord.mybatis.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author felord.cn
 * @since 16:56
 **/
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
public class RegularEmployee extends Employee {
    private static final long serialVersionUID = 6698521717779632645L;
    private Integer level;
    private String jobNumber;
    private Department department;

}
