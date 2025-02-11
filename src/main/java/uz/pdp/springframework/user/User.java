package uz.pdp.springframework.user;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {
    private Integer id;
    private String username;
    private String password;
    private int age;
}
