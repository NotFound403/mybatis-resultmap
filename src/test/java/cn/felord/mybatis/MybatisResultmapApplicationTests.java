package cn.felord.mybatis;

import cn.felord.mybatis.entity.Employee;
import cn.felord.mybatis.entity.RegularEmployee;
import cn.felord.mybatis.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MybatisResultmapApplicationTests {
    @Resource
    EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {

        Employee byId = employeeMapper.findById("1");
        System.out.println(byId);

        Employee employee = employeeMapper.constructorById("2");
        System.out.println("employee = " + employee);

        RegularEmployee regularById = employeeMapper.findRegularById("3");
        System.out.println("regularById = " + regularById);
    }

}
