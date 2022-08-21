package com.bridgelabz.employeepayroll.model;

import lombok.*;
import org.springframework.stereotype.Component;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@ToString
@Component
public class EmployeeDto {

    @NotBlank(message = "Name is mandatory")
    @Pattern(regexp = "^[A-z]{1}[a-zA-Z\\s]{2,}$",message = "Employee name invalid please try again")
    private String employeeName;
    private long salary;
    @Pattern(regexp = "^[M/F]{1}$", message = "Please enter valid opetion.")
    private String gender;
    private String department;

    public EmployeeDto() {
    }

    public EmployeeDto(String employeeName, long salary, String gender, String department) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.gender = gender;
        this.department = department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
