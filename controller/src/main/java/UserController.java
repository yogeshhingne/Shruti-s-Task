import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    ServicePro servicePro1;
    public static void main(String[] args) {
        ServicePro servicePro = new ServicePro();
        System.out.println(servicePro.sum(2, 3));
    }

}