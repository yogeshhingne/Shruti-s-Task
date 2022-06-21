//package student.demo.pro.parcticePro.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import student.demo.pro.parcticePro.entity.User;
//import student.demo.pro.parcticePro.repo.UserRepo;
//
//import java.util.List;
//
//@Service
//public class UserServiceImpl {
//    @Autowired
//    UserRepo userRepo;
//    public User createUser(User user){
//        return userRepo.save(user);
//    }
//    public User getUserByID(int id){
//        return userRepo.findById(id).get();
//    }
//    public List<User> getAllUser(){
//        return userRepo.findAll();
//    }
//    public String deleteUserBYId(int id){
//        userRepo.deleteById(id);
//        return "User deleted successfully";
//    }
//}
