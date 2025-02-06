package uz.pdp.springframework;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@ToString
@Setter
@NoArgsConstructor
public class Person {
    private String fullName;
    private List<String> nickNames;
    private Map<String, String> names;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public static Person getInstance(){
        System.out.println("Inside factory method");
        return new Person();
    }

    private void init(){
        System.out.println("Init method");
    }

    private void destroy(){
        System.out.println("destroy method");
    }
}
