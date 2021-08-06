package com.MybatisWebTest.service.Employee;

import com.MybatisWebTest.mapper.EmployeeMapper;
import com.MybatisWebTest.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
@ResponseBody
public class EmployeeImp implements EmployeeInf{
    @Autowired
    EmployeeMapper mapper;
    @Override
    public List<Employee> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public Employee queryById(int id) {
        return mapper.queryById(id);
    }

    @Override
    public Employee queryByUsername(String username) {
        return mapper.queryByUsername(username);
    }

    @Override
    public int addEmployee(Employee employee) {
        return mapper.addEmployee(employee);
    }

    @Override
    public int deleteEmployeeById(int id) {
        return mapper.deleteEmployeeById(id);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return mapper.updateEmployee(employee);
    }

    @Override
    public List<Employee> queryVagueById(int id) {
        return mapper.queryVagueById(id);
    }

    @Override
    public List<Employee> queryVagueByName(String name) {
        return mapper.queryVagueByName(name);
    }
}
