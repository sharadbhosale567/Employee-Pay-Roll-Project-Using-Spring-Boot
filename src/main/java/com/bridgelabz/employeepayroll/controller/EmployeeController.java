package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.model.EmployeeDto;
import com.bridgelabz.employeepayroll.userservice.EmployeeService;
import com.bridgelabz.employeepayroll.userservice.IEmployeeService;
import com.bridgelabz.employeepayroll.utility.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/Employee")
    public ResponseEntity<Response> getAllEmployees(){
        Response response = employeeService.getAllEmployees();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/Employee/{id}")
    public ResponseEntity<Response> getById(@PathVariable int id) {
        Response response = employeeService.getById(id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PostMapping("/Employee")
    public ResponseEntity<Response> addEmplyee(@Valid @RequestBody EmployeeDto employeeDto){
        Response response = employeeService.addEmployee(employeeDto);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping("/Employee/{id}")
    public ResponseEntity<Response> updateEmployee(@Valid @RequestBody EmployeeDto employeeDto, @PathVariable int id) {
        Response response = employeeService.updateEmployee(id, employeeDto);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @DeleteMapping("/Employee/{id}")
    public ResponseEntity<Response> deleteEmployee(@PathVariable int id ) {
        Response response = employeeService.deleteEmployee(id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
