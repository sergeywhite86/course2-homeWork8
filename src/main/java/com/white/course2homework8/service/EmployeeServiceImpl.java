package com.white.course2homework8.service;


import com.white.course2homework8.entitys.Employee;
import com.white.course2homework8.entitys.Key;
import com.white.course2homework8.enums.Department;
import com.white.course2homework8.exceptions.ArrayIsFull;
import com.white.course2homework8.exceptions.EmployeeAlreadyAdded;
import com.white.course2homework8.exceptions.EmployeeNotFound;
import com.white.course2homework8.repository.EmployeeRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepositoryImpl repository;

    @Override
    public Employee add(String name, String surName, String patronymic, Department department, double salary) {
        Employee employee = new Employee(name, surName, patronymic, department, salary);
        Key key = new Key(name,surName,patronymic);
        if (repository.findAll().size() >= repository.getMaxDBLength()) throw new ArrayIsFull();
        if (repository.findAll().containsKey(key)) throw new EmployeeAlreadyAdded();
        repository.add(key, employee);
        return employee;
    }

    @Override
    public Employee delete(String name, String surName, String patronymic) {
        Key key = new Key(name, surName, patronymic);
        Employee employee;
        if (repository.findAll().containsKey(key)) {
            employee = repository.find(key);
            repository.delete(key);
        } else throw new EmployeeNotFound();
        return employee;
    }

    @Override
    public Employee find(String name, String surName, String patronymic) {
        Key key = new Key(name, surName, patronymic);
        if (!repository.findAll().containsKey(key)) {
            throw new EmployeeNotFound();
        }
        return repository.find(key);
    }
    @Override
    public Map<Key, Employee> findAll() {
        return repository.findAll();
    }

}
