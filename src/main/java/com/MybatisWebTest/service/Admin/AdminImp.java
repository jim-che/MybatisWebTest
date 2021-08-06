package com.MybatisWebTest.service.Admin;

import com.MybatisWebTest.mapper.AdminMapper;
import com.MybatisWebTest.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
@ResponseBody
public class AdminImp implements AdminInf {

    @Autowired
    AdminMapper mapper;

    @Override
    public List<Admin> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public Admin queryById(int id) {
        return mapper.queryById(id);
    }

    @Override
    public Admin queryByUsername(String username) {
        return mapper.queryByUsername(username);
    }

    @Override
    public int addEmployee(Admin admin) {
        return mapper.addEmployee(admin);
    }

    @Override
    public int deleteEmployeeById(int id) {
        return mapper.deleteEmployeeById(id);
    }

    @Override
    public int updateEmployee(Admin admin) {
        return mapper.addEmployee(admin);
    }
}
