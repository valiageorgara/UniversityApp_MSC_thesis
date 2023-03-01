package com.thesis.universityapp.service.impl;

import com.thesis.universityapp.model.Student;
import com.thesis.universityapp.model.University;
import com.thesis.universityapp.repository.StudentRepository;
import com.thesis.universityapp.repository.UniversityRepository;
import com.thesis.universityapp.service.UniversityService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversityServiceImpl implements UniversityService {
    private UniversityRepository universityRepository;
    public UniversityServiceImpl(UniversityRepository universityRepository) {
        super();
        this.universityRepository = universityRepository;
    }
    @Override
    public List<University> getAllUniversities() {
        List<University> universities = universityRepository.findAll();
        universities.forEach(u -> {
            u.getDepartments().size(); // force load departments
        });
        return universities;
    }
    @Override
    public List<University> findAllWithDepartments() {
        return universityRepository.findAllWithDepartments();
    }

    @Override
    public University saveUniversity(University university) {
        return universityRepository.save(university);
    }
}
