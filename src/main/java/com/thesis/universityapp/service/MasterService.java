package com.thesis.universityapp.service;

import com.thesis.universityapp.model.Master;

import java.util.List;

public interface MasterService {
    List<Master> getAllMasters();
    Master saveMaster(Master master);
}
