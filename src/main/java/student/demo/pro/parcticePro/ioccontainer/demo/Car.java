package student.demo.pro.parcticePro.ioccontainer.demo;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@ToString
@Component
public class Car {
    @Autowired
    Engine engine;
    public String getEngineName(){
        return engine.name;
    }
}
