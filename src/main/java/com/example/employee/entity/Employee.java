package com.example.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee {

    @Column
    String name;
    @Column
    int age;
    @Column
    String gender;
    @Column
    int salary;
    @Column
    int companyId;
    @Id
    int id;

    public Employee() {
    }

    public Employee(String name, int age, String gender, int salary, int companyId, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.companyId = companyId;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public int getCompanyId() {
        return companyId;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
    public void setId(int id) {
        this.id = id;
    }
}
