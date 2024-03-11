package com.white.course2homework8.entitys;
import com.white.course2homework8.enums.Department;
import lombok.Data;


@Data
public class Employee {
    private static long idCount;
    private final long id;
    private String name;
    private String surName;
    private String patronymic;
    private Department department;
    private double salary;

    public Employee(String name, String surName, String patronymic, Department department, double salary) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        idCount++;
        this.id = idCount;
    }
    @Override
    public String toString() {
        return "id:" + id +
                " имя:" + name +
                " фамилия:" + surName +
                " отчество:" + patronymic +
                " отдел:" + department.getDepartment() +
                " зарплата:" + salary;
    }
}
