package com.bridgelabz.employeepayroll.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;

@Data
@ToString
@Component
@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid: It should have at least 2 characters starting with Capital letter.")
    private String employeeName;
    @Min(value = 10000, message = "salary cannot be less than 10000.")
    @Max(value = 500000, message = "Salary cannot be greater than 500000.")
    private long salary;
    @Pattern(regexp = "^[M/F]{1}$", message = "Please enter valid option.")
    private String gender;
    @NotBlank(message = "Department is Required")
    private String department;
    public EmployeeDto(String employeeName, long salary, String gender, String department) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.gender = gender;
        this.department = department;
    }
}
