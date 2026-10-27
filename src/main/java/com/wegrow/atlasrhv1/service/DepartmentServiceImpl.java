package com.wegrow.atlasrhv1.service;

import com.wegrow.atlasrhv1.dto.DepartmentResponseDTO;
import com.wegrow.atlasrhv1.dto.EmployeeResponseDTO;
import com.wegrow.atlasrhv1.mapper.DepartmentMapper;
import com.wegrow.atlasrhv1.model.Department;
import com.wegrow.atlasrhv1.model.Employee;
import com.wegrow.atlasrhv1.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository,  DepartmentMapper departmentMapper) {
        this.departmentRepository = departmentRepository;
        this.departmentMapper = departmentMapper;
    }

    @Override
    public DepartmentResponseDTO create(Department department) {
        Department created = departmentRepository.save(department);
        return departmentMapper.toResponseDTO(created);
    }

    @Override
    public DepartmentResponseDTO update(Long id, Employee employee){
        return null;
    }

    @Override
    public Department viewDepartment(Long id){
        return departmentRepository.findById(id).orElse(null);
    }

    @Override
    public List<DepartmentResponseDTO> viewAll(){
        return departmentRepository.findAll()
                .stream().map(departmentMapper::toResponseDTO)
                .toList();

    }

    @Override
    public List<DepartmentResponseDTO> viewAllByManager(Long managerId){
        return null;
    }
}
