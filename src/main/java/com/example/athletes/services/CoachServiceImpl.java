package com.example.athletes.services;

import com.example.athletes.models.Coach;
import com.example.athletes.repositories.CoachRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
public class CoachServiceImpl implements CoachService {

    private final Logger logger = LoggerFactory.getLogger(CoachServiceImpl.class);

    private final CoachRepository coachRepository;

    public CoachServiceImpl(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    @Override
    @Transactional
    public void updateById(Integer id) {
        if(coachRepository.existsById(id)) {
            // Set relationships to null so we can delete without referential problems
            Coach coach = coachRepository.findById(id).get();
            coachRepository.update(coach.getId());
        }
        else
            logger.warn("No coaches exists with ID: " + id);
    }

    @Override
    public Coach findById(Integer integer) {
        return null;
    }

    @Override
    public Collection<Coach> findAll() {
        return null;
    }

    @Override
    public Coach add(Coach entity) {
        return null;
    }

    @Override
    public Coach update(Coach entity) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Coach entity) {

    }
}
