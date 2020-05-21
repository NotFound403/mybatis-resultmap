package cn.felord.mybatis.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * @author felord.cn
 * @since 15:33
 **/
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentAndEmployeeList extends Department {
    private static final long serialVersionUID = -2503893191396554581L;
    private List<RegularEmployee> employees;
}
