package student.demo.pro.parcticePro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import student.demo.pro.parcticePro.entity.User;

public interface UserRepo extends JpaRepository<User,Long> {
}
