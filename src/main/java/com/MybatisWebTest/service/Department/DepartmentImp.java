package com.MybatisWebTest.service.Department;

import com.MybatisWebTest.mapper.DepartmentMapper;
import com.MybatisWebTest.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
@ResponseBody
public class DepartmentImp implements DepartmentSv{
    @Autowired
    DepartmentMapper mapper;

    @Override
    public List<Department> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public Department queryById(int id) {
        return mapper.queryById(id);
    }

    @Override
    public int addDepartment(Department d) {
        return mapper.addDepartment(d);
    }

    @Override
    public int updateDepartment(Department d) {
        return mapper.updateDepartment(d);
    }

    @Override
    public int deleteDepartment(Integer id) {
        return mapper.deleteDepartment(id);
    }
}
