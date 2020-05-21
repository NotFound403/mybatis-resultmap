package cn.felord.mybatis.mapper;

import cn.felord.mybatis.entity.Employee;
import cn.felord.mybatis.entity.RegularEmployee;

/**
 * The interface Employee mapper.
 *
 * @author felord.cn
 * @since 17 :06
 */
public interface EmployeeMapper {

    /**
     * getter  setter .
     *
     * @param employeeId the employee id
     * @return the employee
     */
    Employee findById(String employeeId);

    /**
     * 构造器注入.
     *
     * @param employeeId the employee id
     * @return the employee
     */
    Employee constructorById(String employeeId);

    /**
     * 一对一映射.
     *
     * @param employeeId the employee id
     * @return the regular employee
     */
    RegularEmployee findRegularById(String employeeId);

}
