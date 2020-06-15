package com.dev.spring.webappboot.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dev.spring.webappboot.model.Student;

@Repository
public class StudentDao {
    // create db connection

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Student> getAllStudents() {
        return jdbcTemplate.query("select * from student", new RowMapper<Student>() {

            @Override
            public Student mapRow(ResultSet rs, int rowSum) throws SQLException {
                return new Student(rs.getString("name"), rs.getDouble("exp"));
            }
        });
    }

    public void save(Student student) {
        jdbcTemplate.update("insert into student(name,exp) values (?,?)",
                new Object[] { student.getName(), student.getExp() });
    }

}
