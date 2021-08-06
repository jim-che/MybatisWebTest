package com.MybatisWebTest.mapper;

import com.MybatisWebTest.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@Mapper
public interface DepartmentMapper {
    List<Department> queryAll();
    Department queryById(int id);
    int addDepartment(Department d);
    int updateDepartment(Department d);
    int deleteDepartment(Integer id);
}
