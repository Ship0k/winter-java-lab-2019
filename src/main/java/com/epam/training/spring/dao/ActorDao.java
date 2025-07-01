package com.epam.training.spring.dao;

import com.epam.training.spring.entity.Actor;

import java.util.List;

public interface ActorDao {
    List<Actor> getActorsOfThePlay(int performanceId);
}