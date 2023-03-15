package com.thesis.universityapp.service.impl;

import com.thesis.universityapp.model.Master;
import com.thesis.universityapp.repository.MasterRepository;
import com.thesis.universityapp.service.MasterService;

import java.util.List;

public class MasterServiceImpl implements MasterService {

    private final MasterRepository masterRepository;

    public MasterServiceImpl(MasterRepository masterRepository) {
        super();
        this.masterRepository = masterRepository;
    }

    @Override
    public List<Master> getAllMasters() {
        return masterRepository.findAll();
    }

    @Override
    public Master saveMaster(Master master) {
        return masterRepository.save(master);
    }
}
