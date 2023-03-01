package com.thesis.universityapp.repository;

import com.thesis.universityapp.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long> {
    @Query("SELECT DISTINCT u FROM University u JOIN FETCH u.departments")
    List<University> findAllWithDepartments();
}
