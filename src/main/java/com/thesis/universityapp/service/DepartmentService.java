package com.thesis.universityapp.service;

import com.thesis.universityapp.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department saveDepartment(Department department);
}
