package com.epam.training.spring.dao;

import com.epam.training.spring.constants.SqlRequest;
import com.epam.training.spring.entity.Spectacle;
import com.epam.training.spring.mappers.SpectacleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SpectacleDaoImpl implements SpectacleDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Spectacle> getAllSpectacles() {
        String sql = SqlRequest.SHOW_SPECTACLES;
        return jdbcTemplate.query(sql, new SpectacleMapper());
    }
}