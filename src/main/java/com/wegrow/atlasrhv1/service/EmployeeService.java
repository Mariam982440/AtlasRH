package com.wegrow.atlasrhv1.service;

import com.wegrow.atlasrhv1.dto.EmployeeResponseDTO;
import com.wegrow.atlasrhv1.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee create(Employee dto, Long departmentId);

    //EmployeeResponseDTO update(Long id, Employee employee);

    EmployeeResponseDTO viewEmployee(Long id);

    List<EmployeeResponseDTO> viewAll();

    List<EmployeeResponseDTO> viewAllByManager(Long managerId);
}