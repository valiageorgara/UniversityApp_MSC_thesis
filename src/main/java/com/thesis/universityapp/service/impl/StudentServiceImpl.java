package com.thesis.universityapp.service.impl;
import java.util.List;

import com.thesis.universityapp.model.KeycloakUser;
import org.springframework.stereotype.Service;

import com.thesis.universityapp.model.Student;
import com.thesis.universityapp.repository.StudentRepository;
import com.thesis.universityapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<KeycloakUser> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public KeycloakUser saveStudent(KeycloakUser student) {
        return studentRepository.save(student);
    }

    @Override
    public KeycloakUser getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public KeycloakUser updateStudent(KeycloakUser student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }
}
