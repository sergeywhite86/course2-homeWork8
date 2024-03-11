package com.white.course2homework8.repository;


import com.white.course2homework8.entitys.Employee;
import com.white.course2homework8.entitys.Key;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.Map;


@Getter
@RequiredArgsConstructor
@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final InMemoryDataBase dataBase;
    private final int maxDBLength = 25;

    @Override
    public void add(Key key, Employee employee) {
        dataBase.getData().put(key,employee);
    }
    @Override
    public void delete(Key key) {
        dataBase.getData().remove(key);
    }

    @Override
    public Employee find(Key key) {
        return dataBase.getData().get(key);
    }

    @Override
    public Map<Key, Employee> findAll() {
        return dataBase.getData();
    }
}
