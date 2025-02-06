package uz.pdp.springframework;

public class MyBean {

    public void hi(){
        System.out.println("hello pdp!");
    }

    private void init(){
        System.out.println("MyBean init method");
    }


    private void destroy(){
        System.out.println("MyBean destroy method");
    }
}
