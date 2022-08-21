package com.bridgelabz.employeepayroll.userservice;

import com.bridgelabz.employeepayroll.model.Employee;
import com.bridgelabz.employeepayroll.model.EmployeeDto;
import com.bridgelabz.employeepayroll.repository.EmployeeRepository;
import com.bridgelabz.employeepayroll.utility.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;@Autowired
    private ModelMapper modelMapper;
    @Autowired
    private Response response;
    public Response getAllEmployees() {
        return new Response("All Employee Details",100, employeeRepository.findAll());
    }
    public Response addEmployee(EmployeeDto employeeDto) {
        Employee employee = modelMapper.map(employeeDto, Employee.class);
        employeeRepository.save(employee);
        System.out.println(employee.toString());
        return new Response("New Emplyee Added Successfully..",100,employee);
    }

    public Response getById(int id) {
        return new Response("Get Employee By USing Id",100,employeeRepository.findById(id));
    }

    public Response updateEmployee(int id, EmployeeDto employeeDto) {
        Employee employee = modelMapper.map(employeeDto,Employee.class);
        employeeRepository.save(employee);
        return new Response("Employee info udpdate succefully",100,employee);
    }

    public Response deleteEmployee(int id) {
        return new Response("Employee info delete",100, employeeRepository.deleteById(id));
    }
}
