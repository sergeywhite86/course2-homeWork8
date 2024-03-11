package com.white.course2homework8.repository;

import com.white.course2homework8.entitys.Employee;
import com.white.course2homework8.entitys.Key;

import java.util.Map;

public interface EmployeeRepository {

    void add(Key key, Employee employee);

    void delete(Key key);

    Employee find(Key key);

    Map<Key, Employee> findAll();
}
