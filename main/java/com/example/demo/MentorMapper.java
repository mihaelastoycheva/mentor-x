package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class MentorMapper implements RowMapper<Mentor> {
    public Mentor mapRow(ResultSet rs, int rowNum) throws SQLException {
        Mentor mentor = new Mentor();
        mentor.setId(rs.getInt("id"));
        mentor.setName(rs.getString("name"));
        mentor.setCity(rs.getString("city"));
        mentor.setGrade(rs.getInt("grade"));
        mentor.setSchool(rs.getString("school"));
        mentor.setSubject(rs.getString("subject"));
        mentor.setEmail(rs.getString("email"));
        mentor.setBio(rs.getString("bio"));

        return mentor;
    }
}