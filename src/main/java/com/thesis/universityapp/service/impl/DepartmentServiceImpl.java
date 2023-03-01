package com.thesis.universityapp.service.impl;

import com.thesis.universityapp.model.Department;
import com.thesis.universityapp.repository.DepartmentRepository;
import com.thesis.universityapp.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        super();
        this.departmentRepository = departmentRepository;
    }
    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
