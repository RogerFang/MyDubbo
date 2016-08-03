import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Roger on 2016/8/3.
 */
public class ProviderServer {

    public static void main(String[] args) {
        // 启动方式1：利用Main启动, 注意:自动加载META-INF/spring目录下的所有Spring配置
       /* System.out.println("Provider 注册服务");
        Main.main(args);*/

        // 启动方式2: 利用ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/applicationContext.xml"});
        context.start();
        System.out.println("提供者服务已注册成功");
        try {
            System.in.read();//让此程序一直跑，表示一直提供服务
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
