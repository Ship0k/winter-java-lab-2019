package com.epam.training.spring.dao;

import com.epam.training.spring.entity.Spectacle;

import java.util.List;

public interface SpectacleDao {
    List<Spectacle> getAllSpectacles();
}