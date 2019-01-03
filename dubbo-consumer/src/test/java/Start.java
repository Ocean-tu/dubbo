import com.tu.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("consumer user start");
        UserService userService = context.getBean(UserService.class);
        System.out.println("consumer user");
        System.out.println(userService.getName("1"));

    }
}
