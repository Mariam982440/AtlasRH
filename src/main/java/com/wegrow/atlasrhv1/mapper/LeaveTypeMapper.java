package com.wegrow.atlasrhv1.mapper;

import com.wegrow.atlasrhv1.dto.LeaveTypeResponseDTO;
import com.wegrow.atlasrhv1.model.LeaveType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LeaveTypeMapper {

    LeaveTypeResponseDTO toResponseDTO(LeaveType leavetype);
}
