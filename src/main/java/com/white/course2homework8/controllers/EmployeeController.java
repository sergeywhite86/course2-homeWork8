package com.white.course2homework8.controllers;

import com.white.course2homework8.entitys.Employee;
import com.white.course2homework8.entitys.Key;
import com.white.course2homework8.enums.Department;
import com.white.course2homework8.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService service;

    @GetMapping
    Map<Key, Employee> findAll() {
        return service.findAll();
    }

    @PostMapping("/add")
    public Employee add(@RequestParam String name, @RequestParam String surName, @RequestParam String patronymic,
                        @RequestParam Department department, @RequestParam double salary) {
        return service.add(name, surName, patronymic, department, salary);
    }

    @DeleteMapping("/remove")
    public Employee delete(@RequestParam String name, @RequestParam String surName, @RequestParam String patronymic) {
        return service.delete(name, surName, patronymic);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam String name, @RequestParam String surName, @RequestParam String patronymic) {
        return service.find(name, surName, patronymic);
    }
}
