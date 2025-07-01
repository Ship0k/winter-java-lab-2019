package com.epam.training.spring.dao;

import com.epam.training.spring.constants.SqlRequest;
import com.epam.training.spring.entity.Actor;
import com.epam.training.spring.mappers.ActorMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActorDaoImpl implements ActorDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Actor> getActorsOfThePlay(int performanceId) {
        String sql = SqlRequest.SHOW_ACTORS_OF_THE_PERFORMANCE;
        return jdbcTemplate.query(sql, new ActorMapper(), performanceId);
    }
}