package uz.pdp.springframework;


public class UserService implements Service{
    @Override
    public void hi() {
        System.out.println("Hi from User side");
    }
}
