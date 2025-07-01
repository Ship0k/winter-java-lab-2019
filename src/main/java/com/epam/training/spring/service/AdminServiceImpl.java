package com.epam.training.spring.service;

import com.epam.training.spring.dao.AdminDao;
import com.epam.training.spring.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public List<Genre> getGenres() {
        return adminDao.getGenres();
    }

    @Override
    public List<Director> getDirectors() {
        return adminDao.getDirector();
    }

    @Override
    public List<AdminActor> getActors() {
        return adminDao.getActors();
    }

    @Override
    public List<Amploi> getAmplios() {
        return adminDao.getAmplios();
    }

    @Override
    public void addSpectacle(NewSpectacle newSpectacle) {
        adminDao.addSpectacle(newSpectacle);
    }
}