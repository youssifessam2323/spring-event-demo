package com.joework.springeventdemo.publishers;

import com.joework.springeventdemo.dao.EmployeeDao;
import com.joework.springeventdemo.events.EmployeeEvent;
import com.joework.springeventdemo.models.Employee;
import com.joework.springeventdemo.services.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class EmployeeEventPublisher  implements EmployeeManager, ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public Employee createNewEmployee(){
        var emp = employeeDao.createNewEmployee();
        System.out.println("Emp is : " + emp);
        publisher.publishEvent(new EmployeeEvent(this, "ADD_EMP",emp));

        return emp;
    }


}
