package uz.pdp.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var container = new AnnotationConfigApplicationContext(MyConfig.class);
        Performance bean = container.getBean(Performance.class);
        bean.perform();
    }
}
