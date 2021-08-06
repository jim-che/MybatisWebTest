package com.MybatisWebTest.controller;

import com.MybatisWebTest.pojo.Admin;
import com.MybatisWebTest.pojo.Department;
import com.MybatisWebTest.pojo.Employee;
import com.MybatisWebTest.service.Department.DepartmentImp;
import com.MybatisWebTest.service.Admin.AdminImp;
import com.MybatisWebTest.service.Employee.EmployeeImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.regex.Pattern;

@Controller
public class EmployeeController {

    @Autowired
    AdminImp adminImp;
    @Autowired
    DepartmentImp departmentImp;
    @Autowired
    EmployeeImp employeeImp;

    @GetMapping("/employee")
    public String GotoEmployee(Model model){
        List<Employee> employees = employeeImp.queryAll();
        for (Employee employee : employees) {
            employee.setDepartment(departmentImp.queryById(employee.getDepartmentId()));
        }
        model.addAttribute("emps", employees);
        return "emps/application-employee";
    }

    @RequestMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id){

        employeeImp.deleteEmployeeById(id);
        return "redirect:/employee";
    }


    @RequestMapping("/toAddEmployee")
    public String toAddEmployee(Model model){
        List<Department> departments = departmentImp.queryAll();
        model.addAttribute("depts", departments);
        return "emps/add";
    }

    @PostMapping("/addEmployee")
    public String AddEmployee(Employee employee){
        employee.setDepartment(departmentImp.queryById(employee.getDepartmentId()));
        employeeImp.addEmployee(employee);
        return "redirect:/employee";
    }

    @GetMapping("/toUpdateEmployee/{id}")
    public String toUpdateEmployee(Model model, @PathVariable Integer id){
        Employee employee = employeeImp.queryById(id);
        if(employee.getDepartment()==null){
            employee.setDepartment(departmentImp.queryById(employee.getDepartmentId()));
        }
        model.addAttribute("emp", employee);
        model.addAttribute("depts", departmentImp.queryAll());
        return "emps/update";
    }

    @PostMapping("/updateEmployee")
    public String UpdateEmployee(Employee employee){
        employee.setDepartment(departmentImp.queryById(employee.getDepartmentId()));
        System.out.println(employee);
        employeeImp.updateEmployee(employee);
        return "redirect:/employee";
    }

    @PostMapping("/queryEmployee")
    public String queryEmployee(@RequestParam("msg") String msg, Model model){
        if(msg.isEmpty()){
            return "redirect:/employee";
        }
        System.out.println(msg);
        List<Employee> employees = new ArrayList<>();
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        if(pattern.matcher(msg).matches()){
            employees = employeeImp.queryVagueById(Integer.parseInt(msg));
        }
        List<Employee> employees1 = employeeImp.queryVagueByName(msg);
        employees.addAll(employees1);
        System.out.println(employees);
        for (Employee employee : employees) {
            if(employee.getDepartment()==null){
                employee.setDepartment(departmentImp.queryById(employee.getDepartmentId()));
            }
        }
        model.addAttribute("emps", employees);
        return "emps/application-employee";
    }


}
