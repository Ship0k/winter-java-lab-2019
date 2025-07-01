package com.epam.training.spring.mappers;

import com.epam.training.spring.entity.Director;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DirectorMapper implements RowMapper<Director> {
    @Override
    public Director mapRow(ResultSet resultSet, int i) throws SQLException {
        Director director = new Director();
        director.setId(resultSet.getInt("id"));
        director.setName(resultSet.getString("name"));
        return director;
    }
}