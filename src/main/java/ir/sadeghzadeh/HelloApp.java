package ir.sadeghzadeh;

import ir.sadeghzadeh.utils.LogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class HelloApp {

    @Autowired
    AppConfig appConfig;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloApp helloApp = context.getBean(HelloApp.class);
        helloApp.sayHello();

    }

    @Autowired
    HelloService helloService;
    @Autowired
    HelloService2 helloService2;
    public void sayHello(){
        System.out.println(appConfig.environment.getProperty("app.name"));
        helloService.perform();
        LogUtils.i("Test Logger","545545");
        helloService2.sayHello();
    }

}
