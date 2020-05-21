package cn.felord.mybatis.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author felord.cn
 * @since 16:55
 **/
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
public class TemporaryEmployee extends Employee {
    private static final long serialVersionUID = 1079203515126502939L;
    private Integer companyNo;
    private Department department;
}
