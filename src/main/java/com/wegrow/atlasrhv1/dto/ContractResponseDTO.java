package com.wegrow.atlasrhv1.dto;

import jakarta.persistence.Column;
import com.wegrow.atlasrhv1.model.Contract;

import java.time.LocalDate;

public record ContractResponseDTO(
        Long id,
        String contractType,
        LocalDate startDate,
        LocalDate endDate,
        Long salary
) {

}
