package uz.pdp.springframework.model;

import lombok.*;

import java.time.LocalDateTime;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Todo {

    private Integer id;
    private String title;
    private String priority;
    private LocalDateTime createdAt;

}
