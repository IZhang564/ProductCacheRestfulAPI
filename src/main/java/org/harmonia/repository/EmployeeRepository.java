package org.harmonia.repository;

import org.harmonia.entity.Employee;
import org.harmonia.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);
}
