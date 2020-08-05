package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    public SpeakerServiceImpl () {
        System.out.println("SpeakerserviceImpl no args constructor");
    }
    private SpeakerRepository repository;

    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        System.out.println("SpeakerserviceImpl repository constructor");
        repository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerserviceImpl setter");

        this.repository = repository;
    }
}
