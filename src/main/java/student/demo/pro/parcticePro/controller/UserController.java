//package student.demo.pro.parcticePro.controller;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import retrofit2.http.HTTP;
//import student.demo.pro.parcticePro.dto.request.UserRequest;
//import student.demo.pro.parcticePro.dto.responce.UserResponse;
//import student.demo.pro.parcticePro.entity.User;
//import student.demo.pro.parcticePro.service.UserServiceImpl;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@RestController
//@RequestMapping("/")
//public class UserController {
//    @Autowired
//    UserServiceImpl userService;
//    @Autowired
//    ModelMapper modelMapper;
//    private static Logger logger = LogManager.getLogger(UserController.class);
//    @PostMapping("users")
//    public ResponseEntity<UserResponse> insertUser(@Valid @RequestBody UserRequest userRequest){
//        User user=modelMapper.map(userRequest,User.class);
//        User user1=userService.createUser(user);
//        UserResponse userResponse=modelMapper.map(user1,UserResponse.class);
//        logger.debug("inside insert method");
//        return new ResponseEntity<>(userResponse, HttpStatus.OK);
//    }
//
//    @GetMapping("user/{id}")
//    public User getUser(@PathVariable int id){
//        logger.debug("inside getById method");
//        return userService.getUserByID(id);
//    }
//    @GetMapping("allUser")
//    public List<User>  getAll(){
//        logger.debug("inside GetAll User method");
//        return userService.getAllUser();
//    }
//    @DeleteMapping("deleteUser/{id}")
//        public String deleteUser(@PathVariable int id){
//        logger.debug("inside delete user method");
//            return  userService.deleteUserBYId(id);
//        }
//    }
//
