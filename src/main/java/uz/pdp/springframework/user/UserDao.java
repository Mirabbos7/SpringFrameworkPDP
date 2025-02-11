package uz.pdp.springframework.user;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class UserDao {
    private final JdbcTemplate jdbcTemplate;
    private final SimpleJdbcInsert jdbcInsert;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
    }

    public void save(User user) {
        var paramSource = new BeanPropertySqlParameterSource(user);
        jdbcInsert.withTableName("public.users")
                .usingColumns("username", "password", "age")
                .execute(paramSource);
    }

//    public Integer save2(User user) {
//        var sql = "insert into public.users(id, username, password, age) values(?, ?, ?, ?)";
//        KeyHolder keyHolder = new GeneratedKeyHolder();
//        PreparedStatementCreator creator = new PreparedStatementCreator() {
//            @Override
//            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//                var prst = con.prepareStatement(sql, new String[]{"id"});
//                prst.setInt(1, user.getId());
//                prst.setString(2, user.getUsername());
//                prst.setString(3, user.getPassword());
//                prst.setInt(4, user.getAge());
//                return prst;
//            }
//        };
//        jdbcTemplate.update(creator, keyHolder);
//        Number key = keyHolder.getKey();
//        return key.intValue();
//    }

    public void update(User user) {
        var sql = "update public.users set username = ?, password = ?, age = ? where id = ? ";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getAge(), user.getId());
    }

    public User findById(Integer id) {
        var sql = "select * from public.users where id = ?;";
        var mapper = BeanPropertyRowMapper.newInstance(User.class);
        return jdbcTemplate.queryForObject(sql, mapper, id);
    }

    public List<User> findAll() {
        var sql = "select * from public.users;";
        var mapper = BeanPropertyRowMapper.newInstance(User.class);
        return jdbcTemplate.query(sql, mapper);
    }

    public List<User> findByAge(int age1, int age2) {
        var sql = "select * from public.users where age > ? and age < ?;";
        var mapper = BeanPropertyRowMapper.newInstance(User.class);
        return jdbcTemplate.query(sql, mapper, age1, age2);
    }

    public void delete(Integer id) {
        var sql = "delete from public.users where id = ?";
        jdbcTemplate.update(sql, id);
    }


}
