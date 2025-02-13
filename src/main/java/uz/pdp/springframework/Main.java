package uz.pdp.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.pdp.springframework.beans.Emp;
import uz.pdp.springframework.beans.Employee;
import uz.pdp.springframework.beans.Person;
import uz.pdp.springframework.config.MainConfig;

public class Main {
    public static void main(String[] args) {
        xml_based_context();
        java_config_based_context();
        //annotation_based_context();
    }

    private static void annotation_based_context() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("uz.pdp.springframework.beans");
        System.out.println("Main message");
        Emp employee = context.getBean(Emp.class);
        Emp employee2 = context.getBean(Emp.class);
        employee.setFullName("Bexruz Axmedov");
        employee.setAge("15");
        System.out.println("employee : " + employee);
        System.out.println("employee2 : " + employee2);
        context.close();
    }

    private static void java_config_based_context() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Employee employee = context.getBean(Employee.class);
        Employee employee2 = context.getBean(Employee.class);
        employee.setFullName("Bexruz Axmedov");
        employee.setAge("15");
        System.out.println(employee);
        System.out.println(employee2);
        context.close();
    }

    private static void xml_based_context() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-config.xml");
        Person person = context.getBean(Person.class);
        Person person2 = context.getBean(Person.class);
        person2.setAge("20");
        System.out.println("person2 : "+ person2);
        System.out.println("person : "+ person);
    }
}
