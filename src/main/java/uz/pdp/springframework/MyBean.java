package uz.pdp.springframework;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public void hi(){
        System.out.println("Hello pdp");
    }

    @PostConstruct
    public void init(){
        System.out.println("MYBEAN INIT METHOD");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("MYBEAN INIT METHOD");
    }
}
