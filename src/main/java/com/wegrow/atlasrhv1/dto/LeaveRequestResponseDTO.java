package com.wegrow.atlasrhv1.dto;

import java.time.LocalDate;

public record LeaveRequestResponseDTO(
        Long id,
        LocalDate startDate,
        LocalDate endDate,
        String reason
) {
}
