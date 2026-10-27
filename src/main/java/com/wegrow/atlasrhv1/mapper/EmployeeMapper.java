package com.wegrow.atlasrhv1.mapper;

import com.wegrow.atlasrhv1.dto.EmployeeResponseDTO;
import com.wegrow.atlasrhv1.model.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeResponseDTO toResponseDTO(Employee employee);

}