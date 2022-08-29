package com.example.athletes.services;

import com.example.athletes.models.Athlete;
import com.example.athletes.repositories.AthleteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AthleteServiceImpl implements AthleteService {

    private final Logger logger = LoggerFactory.getLogger(AthleteServiceImpl.class);

    private final AthleteRepository athleteRepository;

    public AthleteServiceImpl(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    @Override
    public Athlete findById(Integer integer) {
        return null;
    }

    @Override
    public Collection<Athlete> findAll() {
        return null;
    }

    @Override
    public Athlete add(Athlete entity) {
        return null;
    }

    @Override
    public Athlete update(Athlete entity) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Athlete entity) {

    }
}
