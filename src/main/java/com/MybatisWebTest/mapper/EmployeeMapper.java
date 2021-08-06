package com.MybatisWebTest.mapper;

import com.MybatisWebTest.pojo.Admin;
import com.MybatisWebTest.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EmployeeMapper {
    List<Employee> queryAll();
    Employee queryById(int id);
    List<Employee> queryVagueById(int id);
    List<Employee> queryVagueByName(String name);
    Employee queryByUsername(String username);
    int addEmployee(Employee employee);
    int deleteEmployeeById(int id);
    int updateEmployee(Employee employee);
}
