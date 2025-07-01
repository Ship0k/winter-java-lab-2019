package com.epam.training.spring.mappers;

import com.epam.training.spring.entity.AdminActor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminActorMapper implements RowMapper<AdminActor> {
    @Override
    public AdminActor mapRow(ResultSet resultSet, int i) throws SQLException {
        AdminActor actor = new AdminActor();
        actor.setId(resultSet.getInt("id"));
        actor.setName(resultSet.getString("name"));
        actor.setGender(resultSet.getString("gender"));
        return actor;
    }
}