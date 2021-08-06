package com.MybatisWebTest.service.Department;

import com.MybatisWebTest.pojo.Department;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
@ResponseBody
public interface DepartmentSv {
    List<Department> queryAll();
    Department queryById(int id);

    int addDepartment(Department d);
    int updateDepartment(Department d);
    int deleteDepartment(Integer id);
}
