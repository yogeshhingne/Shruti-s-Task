package student.demo.pro.parcticePro.stereotype;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Student {
    @Value("Yogesh Hingne")
    private String name;
    @Value("Shegaon")
    private String city;
}
