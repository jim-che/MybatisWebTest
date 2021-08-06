package com.MybatisWebTest.pojo;

import com.MybatisWebTest.service.Department.DepartmentImp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private int employeeId;
    private String username;
    private String password;
    private String name;
    private String email;
    private int gender;
    private int departmentId;
    private Date birth;
    private Department department;
}
