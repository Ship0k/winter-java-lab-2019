package com.epam.training.spring.service;

import com.epam.training.spring.entity.*;

import java.util.List;

public interface AdminService {
    List<Genre> getGenres();
    List<Director> getDirectors();
    List<AdminActor> getActors();
    List<Amploi> getAmplios();
    void addSpectacle(NewSpectacle newSpectacle);
}