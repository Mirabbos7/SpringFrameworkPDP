package uz.pdp.springframework.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Lazy;

@ToString
@Getter
@Setter
@Lazy
public class Employee {
    private String fullName;
    private String age;

    public Employee(String age, String fullName) {
        this.fullName = fullName;
        this.age = age;
    }

    private void init(){
        System.out.println("init method(Employee)");
    }

    private void destroy(){
        System.out.println("destroy method(Employee)");
    }
}
