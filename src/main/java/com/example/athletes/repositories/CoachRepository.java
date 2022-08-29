package com.example.athletes.repositories;

import com.example.athletes.models.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CoachRepository extends JpaRepository<Coach,Integer> {
    @Query(value ="update coach set coach_name where id = ?", nativeQuery = true)
    Optional<Coach> update(Integer id);
}
