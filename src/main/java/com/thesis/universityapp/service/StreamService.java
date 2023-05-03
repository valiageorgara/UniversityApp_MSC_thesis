package com.thesis.universityapp.service;

import com.thesis.universityapp.model.Stream;

import java.util.List;

public interface StreamService {
    List<Stream> getAllStreams();
    Stream saveStream(Stream stream);
}
