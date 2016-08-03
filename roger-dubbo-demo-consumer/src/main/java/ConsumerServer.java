import com.roger.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Roger on 2016/8/3.
 */
public class ConsumerServer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        context.start();
        // RPC远程服务调用, 由provider提供具体实现
        DemoService service = (DemoService) context.getBean("demoService");
        System.out.println(service.sayHello("Roger"));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        com.alibaba.dubbo.container.Main.main(args);
    }
}
