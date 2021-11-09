import com.yl.config.ImportTestService;
import com.yl.example.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: TODO
 * @author: xiaoliang
 * @date: 2021/11/5 0:42
 **/
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new
                AnnotationConfigApplicationContext(SpringConfiguration.class);
        System.out.println(applicationContext.getBean(ImportTestService.class));
    }
}
