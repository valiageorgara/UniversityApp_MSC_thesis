package com.thesis.universityapp.service.impl;

import com.thesis.universityapp.model.Stream;
import com.thesis.universityapp.repository.StreamRepository;
import com.thesis.universityapp.service.StreamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamServiceImpl implements StreamService {
    private final StreamRepository streamRepository;

    public StreamServiceImpl(StreamRepository streamRepository) {
        super();
        this.streamRepository = streamRepository;
    }

    @Override
    public List<Stream> getAllStreams() {
        return streamRepository.findAll();
    }

    @Override
    public Stream saveStream(Stream stream) {
        return streamRepository.save(stream);
    }
}
