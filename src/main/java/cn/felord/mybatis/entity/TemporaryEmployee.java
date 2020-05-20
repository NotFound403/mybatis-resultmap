package cn.felord.mybatis.entity;

import lombok.Data;

/**
 * @author felord.cn
 * @since 16:55
 **/
@Data
public class TemporaryEmployee extends Employee {
    private static final long serialVersionUID = 1079203515126502939L;
    private Integer companyNo;
}
