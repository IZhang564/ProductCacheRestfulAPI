package org.harmonia.service;

import org.harmonia.entity.Employee;
import org.harmonia.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> findEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }
}
