package com.epam.training.spring.mappers;

import com.epam.training.spring.entity.Spectacle;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SpectacleMapper implements RowMapper<Spectacle> {
    @Override
    public Spectacle mapRow(ResultSet resultSet, int i) throws SQLException {
        Spectacle spectacle = new Spectacle();
        spectacle.setIdSpectacle(resultSet.getInt("id"));
        spectacle.setPlayTitle(resultSet.getString("playTitle"));
        spectacle.setAuthorName(resultSet.getString("authorName"));
        spectacle.setPremiere(resultSet.getDate("premiere"));
        spectacle.setDirectorName(resultSet.getString("directorName"));
        spectacle.setGenre(resultSet.getString("genre"));
        return spectacle;
    }
}