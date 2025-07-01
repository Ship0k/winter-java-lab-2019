package com.epam.training.spring.service;

import com.epam.training.spring.dao.SpectacleDao;
import com.epam.training.spring.entity.Spectacle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpectacleServiceImpl implements SpectacleService {
    @Autowired
    public SpectacleDao spectacleDao;

    @Override
    public List<Spectacle> getAll() {
        return spectacleDao.getAllSpectacles();
    }
}