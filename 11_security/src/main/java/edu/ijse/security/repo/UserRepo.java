package edu.ijse.security.repo;

import edu.ijse.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);

//    @Query(value = "select * from User where id=?1",nativeQuery = true)
//    Optional<User> findByUsername(String username);


    //update

//    @Modifying
//    @Query(value = "select * from User where id=?1",nativeQuery = true)
//    Optional<User> findByUsername(String username);
}
