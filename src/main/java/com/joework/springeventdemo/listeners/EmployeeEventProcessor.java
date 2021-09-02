package com.joework.springeventdemo.listeners;

import com.joework.springeventdemo.events.EmployeeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class EmployeeEventProcessor implements ApplicationListener<EmployeeEvent> {


    @Override
    public void onApplicationEvent(EmployeeEvent employeeEvent) {
        System.out.println(String.format("the type: %s \n the comsumed obj: %s \n source: "
                ,employeeEvent.getType(),employeeEvent.getEmp(),employeeEvent.getSource()));
        System.out.println("Source: " + employeeEvent.getSource());
    }
}
