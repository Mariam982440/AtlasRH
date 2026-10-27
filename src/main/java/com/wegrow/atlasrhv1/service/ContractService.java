package com.wegrow.atlasrhv1.service;

import com.wegrow.atlasrhv1.dto.ContractResponseDTO;
import com.wegrow.atlasrhv1.dto.DepartmentResponseDTO;
import com.wegrow.atlasrhv1.model.Contract;
import com.wegrow.atlasrhv1.model.Department;
import com.wegrow.atlasrhv1.model.Employee;

import java.util.List;

public interface ContractService {

    ContractResponseDTO create(Contract contract);

    ContractResponseDTO update(Long id, Contract contract);

    Department viewDepartment(Long id);

    List<ContractResponseDTO> viewAll();
}
