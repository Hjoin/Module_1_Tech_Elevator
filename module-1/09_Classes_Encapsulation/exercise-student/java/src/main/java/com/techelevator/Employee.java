package com.techelevator;

public class Employee {
    private final int employeeId; //employeeId variable
    private final String firstName; //firstName variable
    private String lastName; //lastName variable
    private String fullName; //fullName variable
    private String department; //department variable
    private double annualSalary; //annualSalary variable

    public Employee(int employeeId, String firstName,
                    String lastName, double Salary) { //constructor set up for Employee
        this.employeeId = employeeId; //grabbing values
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = Salary;
        this.fullName = lastName + ", " + firstName;
    }

    public int getEmployeeId() { //get statement for employeeId
        return employeeId;
    }

    public String getFirstName() { //get statement for firstName
        return firstName;
    }

    public String getLastName() { //get statement for lastName
        return lastName;
    }

    public String getFullName() { //get statement for fullName
        return fullName;
    }

    public String getDepartment() { //get statement for department
        return department;
    }

    public double getAnnualSalary() { //get statement for annualSalary
        return annualSalary;
    }

    public void setLastName(String lastName) { //set for lastName/fullName
        this.lastName = lastName;
        this.fullName = lastName + ", " + firstName;
    }

    public void setDepartment(String department) { //set for department
        this.department = department;
    }
    public void raiseSalary(double percent) { //raising salary method
        annualSalary = annualSalary * ((100 + percent) / 100); //new annualSalary calculated
    }



}
