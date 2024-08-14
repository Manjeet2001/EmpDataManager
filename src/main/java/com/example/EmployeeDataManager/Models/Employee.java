package com.example.EmployeeDataManager.Models;


public class Employee {
    private int empId;
    private String FirstName;
    private String LastName;
    private String empMail;
    private int salary;

    public Employee(){
    }

    public Employee(int empId, String FirstName, String LastName, String empMail, int salary){
        this.empId = empId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.empMail = empMail;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmpMail() {
        return empMail;
    }

    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }
}
