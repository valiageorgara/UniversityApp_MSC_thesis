package com.thesis.universityapp.service;

import com.thesis.universityapp.model.Application;
import com.thesis.universityapp.model.KeycloakUser;
import com.thesis.universityapp.model.Student;

import java.util.List;

public interface ApplicationService {
    List<Application> getAllApplications();
    Application saveApplication(Application application);

//    List<Application> findByKeycloakUser(KeycloakUser keycloakUser);
}
