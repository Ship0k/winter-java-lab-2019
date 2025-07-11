package com.epam.training.spring.mappers;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetIdMapper implements RowMapper<Integer> {
    @Override
    public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getInt("id");
    }
}