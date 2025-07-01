package com.epam.training.spring.dao;

import com.epam.training.spring.entity.*;

import java.util.List;

public interface AdminDao {
    List<Genre> getGenres();
    List<Director> getDirector();
    List<AdminActor> getActors();
    List<Amploi> getAmplios();
    void addSpectacle(NewSpectacle newSpectacle);
}