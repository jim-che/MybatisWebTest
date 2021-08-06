package com.MybatisWebTest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int employeeId;
    private String name;
    private String email;
    private int gender;
    private int departmentId;
    private Department department;
}
