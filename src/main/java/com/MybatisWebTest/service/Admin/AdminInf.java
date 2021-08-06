package com.MybatisWebTest.service.Admin;

import com.MybatisWebTest.pojo.Admin;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Service
@ResponseBody
public interface AdminInf {
    List<Admin> queryAll();
    Admin queryById(int id);
    Admin queryByUsername(String username);
    int addEmployee(Admin admin);
    int deleteEmployeeById(int id);
    int updateEmployee(Admin admin);

}
