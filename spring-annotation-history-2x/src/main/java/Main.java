import com.yl.example.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @description: TODO
 * @author: xiaoliang
 * @date: 2021/11/5 0:42
 **/
public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println(context.getBean(HelloService.class));
    }
}
