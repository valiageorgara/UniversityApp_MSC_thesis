package com.thesis.universityapp.repository;

import com.thesis.universityapp.model.Application;
import com.thesis.universityapp.model.KeycloakUser;
import com.thesis.universityapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findByKeycloakUser(KeycloakUser keycloakUser);

}