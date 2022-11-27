package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Qualifier("mentors")
@Repository
public class MentorsRepository implements CrudRepository<Mentor, Integer> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private MentorMapper mentorMapper;

    public MentorsRepository()
    {
        this.mentorMapper = new MentorMapper();
    }

    @Override
    public <S extends Mentor> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Mentor> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Mentor> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Mentor> findAll() {
        String sql = "SELECT * FROM mentors;";

        var mentors = this.jdbcTemplate.query(sql, new MentorMapper());

        return mentors;
    }

    @Override
    public Iterable<Mentor> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Mentor entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Mentor> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
