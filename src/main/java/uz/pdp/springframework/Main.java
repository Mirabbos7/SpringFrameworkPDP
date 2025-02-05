package uz.pdp.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.springframework.config.MyConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MyConfig.class);
        MyBean2 myBean = container.getBean(MyBean2.class);
        myBean.hi();

    }
}
