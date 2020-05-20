package cn.felord.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"cn.felord.mybatis.mapper"})
@SpringBootApplication
public class MybatisResultmapApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisResultmapApplication.class, args);
    }

}
