package com.MybatisWebTest.mapper;


import com.MybatisWebTest.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AdminMapper {
    List<Admin> queryAll();
    Admin queryById(int id);
    Admin queryByUsername(String username);
    int addEmployee(Admin admin);
    int deleteEmployeeById(int id);
    int updateEmployee(Admin admin);

}
