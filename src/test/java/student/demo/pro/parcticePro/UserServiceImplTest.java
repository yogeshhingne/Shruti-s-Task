//package student.demo.pro.parcticePro;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import static org.junit.Assert.assertNotNull;
//import static org.mockito.Mockito.when;
//import static org.junit.Assert.assertEquals;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserServiceImplTest {
//    @Autowired
//    UserServiceImpl userService;
//    @MockBean
//    UserRepo userRepo;
//    @Test
//    public void getAllUserTest(){
//        when(userRepo.findAll()).thenReturn(Stream.of(new User(1,"Yogesh","Hingne","yog1120@gmail.com")).collect(Collectors.toList()));
//        assertEquals(1,userService.getAllUser().size());
//    }
// @Test
//    public void saveUserTest(){
//        User user=new User(1,"Yogesh","Hingne","yog1120@gmail.com");
//        when(userRepo.save(user)).thenReturn(user);
//        assertEquals(user,userService.createUser(user));
// }
//
//}
