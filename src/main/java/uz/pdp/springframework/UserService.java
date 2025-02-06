package uz.pdp.springframework;

import org.springframework.stereotype.Component;

@Component
public class UserService implements Service{
    @Override
    public void hi() {
        System.out.println("hi from userService side");
    }
}
