package cn.felord.mybatis.entity;

import lombok.Data;

/**
 * @author felord.cn
 * @since 16:56
 **/
@Data
public class RegularEmployee extends Employee {
    private static final long serialVersionUID = 6698521717779632645L;
    private Integer level;
    private Department departmentId;
}
