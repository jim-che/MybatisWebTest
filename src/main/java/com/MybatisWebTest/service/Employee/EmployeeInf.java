package com.MybatisWebTest.service.Employee;
import com.MybatisWebTest.pojo.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Service
@ResponseBody
public interface EmployeeInf {
    List<Employee> queryAll();
    Employee queryById(int id);
    Employee queryByUsername(String username);
    int addEmployee(Employee employee);
    int deleteEmployeeById(int id);
    int updateEmployee(Employee employee);
    List<Employee> queryVagueById(int id);
    List<Employee> queryVagueByName(String name);
}
