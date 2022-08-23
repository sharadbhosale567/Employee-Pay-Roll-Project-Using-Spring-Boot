package com.bridgelabz.employeepayroll.userservice;

import com.bridgelabz.employeepayroll.utility.EmployeeDto;
import com.bridgelabz.employeepayroll.utility.Response;

public interface IEmployeeService {
    Response getAllEmployees();
    Response addEmployee(EmployeeDto employeeDto);
    Response getById(int id);
    Response updateEmployee(int id, EmployeeDto employeeDto);
    Response deleteEmployee(int id);
}
