package uz.pdp.springframework;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@NoArgsConstructor
public class Person {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public static Person getInstance(){
        System.out.println("Inside factory method");
        return new Person();
    }


}
