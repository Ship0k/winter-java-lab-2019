package com.epam.training.spring.mappers;

import com.epam.training.spring.entity.Actor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ActorMapper implements RowMapper<Actor> {
    @Override
    public Actor mapRow(ResultSet resultSet, int i) throws SQLException {
        Actor actor = new Actor();
        actor.setId(resultSet.getInt("id"));
        actor.setRole(resultSet.getString("role"));
        actor.setGender(resultSet.getString("gender"));
        actor.setName(resultSet.getString("name"));
        actor.setRank(resultSet.getString("rank"));
        return actor;
    }
}