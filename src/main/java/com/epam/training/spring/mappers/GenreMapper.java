package com.epam.training.spring.mappers;

import com.epam.training.spring.entity.Genre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreMapper implements RowMapper<Genre> {
    @Override
    public Genre mapRow(ResultSet resultSet, int i) throws SQLException {
        Genre genre = new Genre();
        genre.setId(resultSet.getInt("GenreID"));
        genre.setGenreTitle(resultSet.getString("Genre_Title"));
        return genre;
    }
}