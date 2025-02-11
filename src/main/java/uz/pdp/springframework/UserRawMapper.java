package uz.pdp.springframework;

import org.springframework.jdbc.core.RowMapper;
import uz.pdp.springframework.user.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRawMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return User.builder()
                .id(rs.getInt("id"))
                .username(rs.getString("username"))
                .password(rs.getString("password"))
                .age(rs.getInt("age"))
                .build();
    }
}
