package com.joework.springeventdemo.events;

import com.joework.springeventdemo.models.Employee;
import org.springframework.context.ApplicationEvent;

public class EmployeeEvent extends ApplicationEvent{

    private final String type;
    private final Employee emp;

    public String getType() {
        return type;
    }

    public Employee getEmp() {
        return emp;
    }

    public EmployeeEvent(Object source, String type, Employee emp){
        super(source);
        this.type = type;
        this.emp = emp ;


    }

}


