package uz.pdp.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MyConfig {

    @Bean
    public Performance performance() {
        return new Performance();
    }

    @Bean
    public Audience audience(){
        return new Audience();
    }
}
