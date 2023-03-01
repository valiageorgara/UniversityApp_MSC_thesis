package com.thesis.universityapp.service;

import com.thesis.universityapp.model.Student;
import com.thesis.universityapp.model.University;

import java.util.List;

public interface UniversityService {
    List<University> getAllUniversities();
    List<University> findAllWithDepartments();
    University saveUniversity(University university);
}
