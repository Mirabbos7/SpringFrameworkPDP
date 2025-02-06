package uz.pdp.springframework;



public class AdminService implements Service{
    @Override
    public void hi() {
        System.out.println("Hi from Server side");
    }
}
