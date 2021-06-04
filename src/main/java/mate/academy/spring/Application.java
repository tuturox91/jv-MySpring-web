package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        User firstUser = new User();
        firstUser.setName("Bob");
        firstUser.setLastName("Robson");
        userService.add(firstUser);
        User secondUser = new User();
        secondUser.setName("Alice");
        secondUser.setLastName("Alyson");
        userService.add(secondUser);
        userService.listUsers().forEach(System.out::println);
    }
}
