package com.thesis.universityapp.model;

import javax.persistence.*;

@Entity
public class StreamPref {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String streamName;

    private Integer priority;
    @ManyToOne
    @JoinColumn(name = "stream_id")
    private Stream stream;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    public StreamPref(Long id, String streamName, Integer priority, Stream stream, Application application) {
        this.id = id;
        this.streamName = streamName;
        this.priority = priority;
        this.stream = stream;
        this.application = application;
    }

    public Stream getStream() {
        return stream;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }

    public StreamPref() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
}
