import com.spring.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //使用user,userNew,user2,user3,user4,user5都可以
        User user = context.getBean("user5", User.class);  //可以通过别名获取到User对象
        System.out.println(user.toString());
    }
}
