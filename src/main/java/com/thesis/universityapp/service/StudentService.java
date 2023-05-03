package com.thesis.universityapp.service;

import java.util.List;

import com.thesis.universityapp.model.KeycloakUser;
import com.thesis.universityapp.model.Student;

public interface StudentService {
    List<KeycloakUser> getAllStudents();
    KeycloakUser saveStudent(KeycloakUser student);
    KeycloakUser getStudentById(String id);
    KeycloakUser updateStudent(KeycloakUser student);
    void deleteStudentById(String id);
}
