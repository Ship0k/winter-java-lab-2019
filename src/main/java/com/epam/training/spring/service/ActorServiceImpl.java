package com.epam.training.spring.service;

import com.epam.training.spring.dao.ActorDao;
import com.epam.training.spring.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {
    @Autowired
    private ActorDao actorDao;

    @Override
    public List<Actor> getActorsOfTheSpectacle(int id) {
        return actorDao.getActorsOfThePlay(id);
    }
}