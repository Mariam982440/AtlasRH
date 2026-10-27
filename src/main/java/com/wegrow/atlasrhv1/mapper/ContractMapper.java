package com.wegrow.atlasrhv1.mapper;

import com.wegrow.atlasrhv1.dto.ContractResponseDTO;
import com.wegrow.atlasrhv1.model.Contract;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContractMapper {

    ContractResponseDTO toResponseDTO(Contract contract);
}
