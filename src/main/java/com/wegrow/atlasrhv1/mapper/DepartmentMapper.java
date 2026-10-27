package com.wegrow.atlasrhv1.mapper;

import com.wegrow.atlasrhv1.dto.DepartmentResponseDTO;
import com.wegrow.atlasrhv1.model.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    DepartmentResponseDTO toResponseDTO(Department department);
}
