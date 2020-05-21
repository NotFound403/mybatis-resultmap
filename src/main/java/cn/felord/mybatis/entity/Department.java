package cn.felord.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author felord.cn
 * @since 16:54
 **/
@Data
public class Department implements Serializable {
    private static final long serialVersionUID = 1230986161187676346L;
    private String departmentId;
    private String departmentName;
    private Integer departmentLevel;
}
