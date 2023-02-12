package com.thesis.universityapp.service;

import com.thesis.universityapp.model.Call;

import java.util.List;

public interface CallService {
    List<Call> getAllCalls();
    Call saveCall(Call call);
}
