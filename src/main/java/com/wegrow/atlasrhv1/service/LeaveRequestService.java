package com.wegrow.atlasrhv1.service;

import com.wegrow.atlasrhv1.dto.DepartmentResponseDTO;
import com.wegrow.atlasrhv1.model.Department;
import com.wegrow.atlasrhv1.model.Employee;

import java.util.List;

public interface LeaveRequestService {
    DepartmentResponseDTO create(Department department);

    DepartmentResponseDTO update(Long id, Employee employee);

    Department viewDepartment(Long id);

    List<DepartmentResponseDTO> viewAll();

    List<DepartmentResponseDTO> viewAllByManager(Long managerId);
}
