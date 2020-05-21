package cn.felord.mybatis.mapper;

import cn.felord.mybatis.entity.DepartmentAndEmployeeList;

/**
 * The interface Department mapper.
 *
 * @author a
 * @since 11 :43
 */
public interface DepartmentMapper {

    /**
     * 测试一对多.
     *
     * @param departmentId the department id
     * @return the department and employee list
     */
    DepartmentAndEmployeeList findById(String departmentId);

}
