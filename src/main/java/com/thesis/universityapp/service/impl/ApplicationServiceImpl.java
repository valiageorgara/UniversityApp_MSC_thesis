package com.thesis.universityapp.service.impl;

import com.thesis.universityapp.model.Application;
import com.thesis.universityapp.model.Student;
import com.thesis.universityapp.repository.ApplicationRepository;
import com.thesis.universityapp.service.ApplicationService;
import com.thesis.universityapp.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApplicationServiceImpl implements ApplicationService {

    private ApplicationRepository applicationRepository;

    @Override
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }
}
