package com.joework.springeventdemo.dao;

import com.joework.springeventdemo.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public Employee createNewEmployee() {
            return Stream.of("ahmed","mahmoud", "hima")
                    .map(s -> new Employee(0,s,20))
                    .findAny()
                    .get();
//                    .findFirst().get();
    }
}
