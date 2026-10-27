package com.wegrow.atlasrhv1.repository;

import com.wegrow.atlasrhv1.model.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
}
