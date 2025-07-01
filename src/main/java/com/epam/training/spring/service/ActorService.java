package com.epam.training.spring.service;

import com.epam.training.spring.entity.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> getActorsOfTheSpectacle(int id);
}