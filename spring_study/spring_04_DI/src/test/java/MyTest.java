import com.spring.pojo.Student;
import com.spring.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

        /*
         * Student {
         *   name='徐仕成',
         *   address=Address{address='大新'},
         *   books=[C语言权威指南, 计算机网络, 深入实践Spring Boot, JavaScript 经典案例, Vue.js实战],
         *   hobbies=[听歌, 敲代码, 看电影],
         *   card={
         *       身份证=451564854684,
         *       银行卡=42231316531321
         *   },
         *   games=[LOL, COC, BOB], wife='null',
         *   info={
         *       password=123456,
         *       url=男,
         *       driver=31620520,
         *       username=root
         *   }
         * }
         * */


        User user = context.getBean("user", User.class);
        System.out.println(user.toString());

        User user2 = context.getBean("user2", User.class);
        System.out.println(user2.toString());
    }
}
