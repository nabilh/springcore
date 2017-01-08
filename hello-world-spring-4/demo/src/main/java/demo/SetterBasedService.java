package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nabil on 1/7/17.
 */
@Component
public class SetterBasedService {

    private HelloWorldService service;

    @Autowired
    public void setService (HelloWorldService service) {
        this.service = service;
    }

    void getMessage ()  {
        service.sayHello();
    }

}
