package uz.pdp.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import uz.pdp.springframework.beans.Employee;

@Configuration
public class MainConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    public Employee employee(){
        return new Employee("19", "Mirabbos Axmedov");
    }
}
