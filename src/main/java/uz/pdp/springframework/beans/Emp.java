package uz.pdp.springframework.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Setter
@Component
@Scope("singleton")
@Lazy
public class Emp {
    private String fullName;
    private String age;

    public Emp(){
    }

    @PostConstruct
    private void init(){
        System.out.println("init method(Employee)");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("destroy method(Employee)");
    }
}
