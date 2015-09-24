package ir.sadeghzadeh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

/**
 * Created by reza on 9/18/15.
 */
@Configuration
@ComponentScan
@PropertySource("config.properties")
@ImportResource("classpath:configuration.xml")
@EnableAspectJAutoProxy
public class AppConfig {

    @Autowired
    public  Environment environment;

}
