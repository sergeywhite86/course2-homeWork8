package com.white.course2homework8.service;

import com.white.course2homework8.entitys.Employee;
import com.white.course2homework8.entitys.Key;
import com.white.course2homework8.enums.Department;

import java.util.Map;

public interface EmployeeService {
    Employee add(String name, String surName, String patronymic, Department department, double salary);

    Employee delete(String name, String surName, String patronymic);

    Employee find(String name, String surName, String patronymic);

    Map<Key,Employee> findAll();
}
