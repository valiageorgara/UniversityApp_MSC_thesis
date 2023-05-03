package com.thesis.universityapp.repository;


import com.thesis.universityapp.model.Stream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRepository  extends JpaRepository<Stream, Long> {
}