package com.wegrow.atlasrhv1.mapper;

import com.wegrow.atlasrhv1.dto.LeaveRequestResponseDTO;
import com.wegrow.atlasrhv1.model.LeaveRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LeaveRequestMapper {

    LeaveRequestResponseDTO toResponseDTO(LeaveRequest leaveRequest);
}
