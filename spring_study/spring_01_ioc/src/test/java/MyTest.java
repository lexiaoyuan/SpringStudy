import com.spring.dao.UserDaoImpl;
import com.spring.dao.UserDaoMysqlImpl;
import com.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //------传统方式-------
        /*//用户只关心业务层
        UserServiceImpl userService = new UserServiceImpl();
        // 想调用哪一种dao层的实现，就set哪一种
        userService.setUserDao(new UserDaoMysqlImpl());
        //用户调用service层的方法
        userService.getUser();*/


        //-------使用Spring--------
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        userService.getUser();


    }
}
