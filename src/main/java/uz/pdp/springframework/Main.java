package uz.pdp.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        MyBean myBean = context.getBean(MyBean.class);
        Person person = (Person) context.getBean("person");
        System.out.println(myBean);
        System.out.println(person);
        System.out.println(context.getBean(BaseDAO.class));
        context.close();
    }
}
