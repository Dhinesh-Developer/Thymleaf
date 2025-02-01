package com.dk.Lib.Controller;

import com.dk.Lib.Entity.Employee;
import com.dk.Lib.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public String listEmployee(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees"; // This should match your Thymeleaf file name (employees.html)
    }

    @GetMapping("/new")
    public String showEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee()); // Fixed model attribute name
        return "employee-form";
    }

    @PostMapping("/saveEmployee") // Added explicit mapping
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    @DeleteMapping("/delete/{eId}")
    public void deleteEmployee(@PathVariable Integer eId){
        employeeService.deleteEmployee(eId);
    }
}
