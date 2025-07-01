package com.epam.training.spring.mappers;

import com.epam.training.spring.entity.Amploi;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AmploiMapper implements RowMapper<Amploi> {
    @Override
    public Amploi mapRow(ResultSet resultSet, int i) throws SQLException {
        Amploi amploi = new Amploi();
        amploi.setId(resultSet.getInt("id"));
        amploi.setTitle(resultSet.getString("title"));
        return amploi;
    }
}