package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    public SpeakerServiceImpl () {
        System.out.println("SpeakerserviceImpl no args constructor");
    }
    private SpeakerRepository repository;

    @Autowired //constructor injection
    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        System.out.println("SpeakerserviceImpl repository constructor");
        repository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    //@Autowired //setter injection
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerserviceImpl setter");

        this.repository = repository;
    }
}
