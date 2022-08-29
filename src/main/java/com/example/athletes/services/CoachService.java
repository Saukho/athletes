package com.example.athletes.services;

import com.example.athletes.models.Coach;

public interface CoachService extends CrudService<Coach, Integer> {
    void updateById(Integer integer);
}
