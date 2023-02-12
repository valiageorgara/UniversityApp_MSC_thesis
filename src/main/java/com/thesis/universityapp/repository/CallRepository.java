package com.thesis.universityapp.repository;

import com.thesis.universityapp.model.Call;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallRepository  extends JpaRepository<Call, Long> {
}
