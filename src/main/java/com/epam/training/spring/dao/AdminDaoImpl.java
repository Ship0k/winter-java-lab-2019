package com.epam.training.spring.dao;

import static com.epam.training.spring.constants.SqlRequest.*;
import com.epam.training.spring.entity.*;
import com.epam.training.spring.mappers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminDaoImpl implements AdminDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Genre> getGenres() {
        return jdbcTemplate.query(SHOW_GENRES, new GenreMapper());
    }

    @Override
    public List<Director> getDirector() {
        return jdbcTemplate.query(SHOW_DIRECTORS, new DirectorMapper());
    }

    @Override
    public List<AdminActor> getActors() {
        return jdbcTemplate.query(SHOW_ACTORS, new AdminActorMapper());
    }

    @Override
    public List<Amploi> getAmplios() {
        return jdbcTemplate.query(SHOW_AMPLIOS, new AmploiMapper());
    }

    @Override
    public void addSpectacle(NewSpectacle ns) {
        jdbcTemplate.update(ADD_PlAYS, ns.getPlayTitle(), ns.getAuthor(), ns.getGenre(), ns.getReleaseDate());

        int playId = jdbcTemplate.queryForObject(GET_PLAY_ID, new GetIdMapper(), ns.getPlayTitle());
        jdbcTemplate.update(ADD_PERFORMANCES, playId, ns.getDirector(), ns.getPremiere());

        for (int i = 0; i < ns.getActors().size(); i++) {
            List<Integer> amploisId = jdbcTemplate.query(GET_AMPLOIS_ID, new GetIdMapper(), ns.getAmploi(i));
            if (amploisId.isEmpty()) {
                jdbcTemplate.update(ADD_AMPLOIS, ns.getAmploi(i));
                amploisId = jdbcTemplate.query(GET_AMPLOIS_ID, new GetIdMapper(), ns.getAmploi(i));
            }

            int performanceId = jdbcTemplate.queryForObject(GET_PERFORMANCE_ID, new GetIdMapper(), playId);
            jdbcTemplate.update(ADD_EMPLOYMENTS, ns.getActor(i), amploisId.get(0), performanceId, ns.getBudget(i));
        }
    }
}