package uz.pdp.springframework.user;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class UserDao2 {
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public UserDao2(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public void save(User user) {
        var sql = "insert into public.users (username, password, age) values(:username , :password, :age)";
        SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(user);
        namedParameterJdbcTemplate.update(sql, sqlParameterSource);
    }

    public Integer save2(User user) {
        var sql = "insert into public.users (username, password, age) values(:username , :password, :age)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        SqlParameterSource paramSource = new MapSqlParameterSource()
                .addValue("username", user.getUsername())
                .addValue("password", user.getPassword())
                .addValue("age", user.getAge());
        namedParameterJdbcTemplate.update(sql, paramSource, keyHolder, new String[]{"id"});
        return (Integer) keyHolder.getKeys().get("id");
    }


}
