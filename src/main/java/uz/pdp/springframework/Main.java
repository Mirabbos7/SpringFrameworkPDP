package uz.pdp.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.pdp.springframework.user.User;
import uz.pdp.springframework.user.UserDao;
import uz.pdp.springframework.user.UserDao2;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-settings.xml");
//        UserDao userDao = context.getBean(UserDao.class);
//        User user = User.builder()
//                .id(99)
//                .username("dude")
//                .password("123")
//                .age(123456789)
//                .build();

        //userDao.save(user);
        //System.out.println(userDao.findById(11));
        //userDao.findByAge(14, 20).forEach(System.out::println);
        //userDao.update(user);
        //userDao.delete(9);
//        System.out.println("userDao.save2(user) = " + userDao.save2(user));
//        System.out.println(userDao.findAll());


        UserDao userDao = context.getBean(UserDao.class);
        User user = User.builder()
                .username("dude2")
                .password("123")
                .age(123)
                .build();

        userDao.save(user);
    }
}
