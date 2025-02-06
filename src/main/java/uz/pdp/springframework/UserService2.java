package uz.pdp.springframework;

import org.springframework.stereotype.Component;

@Component
public class UserService2 implements Service{
    @Override
    public void hi() {
        System.out.println("hi from userService2 side");
    }
}
