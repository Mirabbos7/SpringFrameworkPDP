package uz.pdp.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(context.getBean(MyBean2.class));
        context.getBean(UserService.class).hi();
        context.getBean(AdminService.class).hi();
        context.close();
    }
}
