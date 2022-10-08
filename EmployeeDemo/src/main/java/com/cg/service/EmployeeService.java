package com.cg.service;
import com.cg.entity.Employee;
import java.util.List;

public interface EmployeeService
{
    public List<Employee> getAllEmployees();
    public Employee saveEmployee(Employee employee);
    public Employee getEmployeeById(int employeeId);
    public void deleteEmployee(int employeeId);
    public Employee updateEmployee(Employee employee);
}




