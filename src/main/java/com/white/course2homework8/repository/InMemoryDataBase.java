package com.white.course2homework8.repository;

import com.white.course2homework8.entitys.Employee;
import com.white.course2homework8.entitys.Key;
import com.white.course2homework8.enums.Department;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.HashMap;

import java.util.Map;

@Component
@RequiredArgsConstructor
@Getter
public class InMemoryDataBase {

    private final Map<Key, Employee> data;
    public InMemoryDataBase() {
        data = new HashMap<>();
        initDB();
    }
    private void initDB() {
        Employee emp1 = new Employee("Лука", "Святой", "Михайлович", Department.HR, 50000);
        Employee emp2 = new Employee("Дмитрий", "Гришенков", "Викторович", Department.HR, 95000);
        Employee emp3 = new Employee("Аркадий", "Продавцов", "Николаевич", Department.MANAGERS, 52000);
        Employee emp4 = new Employee("Екатерина", "Певцова", "Ивановна", Department.MANAGERS, 65000);
        Employee emp5 = new Employee("Марина", "Управова", "Ивановна", Department.ADMINISTRATION, 185500);
        Employee emp6 = new Employee("Роман", "Иванов", "Иванович", Department.ADMINISTRATION, 150000);
        Employee emp7 = new Employee("Иван", "Скала", "Игоревич", Department.SECURITY, 45000);
        Employee emp8 = new Employee("Игорь", "Рыбов", "Михайлович", Department.SECURITY, 52500);
        Employee emp9 = new Employee("Олег", "Путилов", "Иванович", Department.SECURITY, 53000);
        Employee emp10 = new Employee("Инокентий", "Джавов", "Олегович", Department.IT, 70000);
        Employee emp11 = new Employee("Ксения", "Плюсова", "Александровна", Department.IT, 150000);
        Employee emp12 = new Employee("Мария", "Кошкина", "Сергеевна", Department.IT, 85500);

        data.put(new Key(emp1.getName(),emp1.getSurName(),emp1.getPatronymic()),emp1);
        data.put(new Key(emp2.getName(),emp2.getSurName(),emp2.getPatronymic()),emp2);
        data.put(new Key(emp3.getName(),emp3.getSurName(),emp3.getPatronymic()),emp3);
        data.put(new Key(emp4.getName(),emp4.getSurName(),emp4.getPatronymic()),emp4);
        data.put(new Key(emp5.getName(),emp5.getSurName(),emp5.getPatronymic()),emp5);
        data.put(new Key(emp6.getName(),emp6.getSurName(),emp6.getPatronymic()),emp6);
        data.put(new Key(emp7.getName(),emp7.getSurName(),emp7.getPatronymic()),emp7);
        data.put(new Key(emp8.getName(),emp8.getSurName(),emp8.getPatronymic()),emp8);
        data.put(new Key(emp9.getName(),emp9.getSurName(),emp9.getPatronymic()),emp9);
        data.put(new Key(emp10.getName(),emp10.getSurName(),emp10.getPatronymic()),emp10);
        data.put(new Key(emp11.getName(),emp11.getSurName(),emp11.getPatronymic()),emp11);
        data.put(new Key(emp12.getName(),emp12.getSurName(),emp12.getPatronymic()),emp12);

    }
}
