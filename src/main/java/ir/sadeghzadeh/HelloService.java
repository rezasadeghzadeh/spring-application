package ir.sadeghzadeh;

import ir.sadeghzadeh.utils.LogUtils;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String sayHello() {
        return "Hello world!";
    }

    //@Override
    public void perform() {
        try {
            LogUtils.i("performance method"," called");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
