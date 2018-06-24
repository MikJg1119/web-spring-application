package com.wmusial.repositories;

import com.wmusial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;




@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // List<User> findByEmail(String search);
    @Query("SELECT u FROM User u "+" WHERE u.firstName= :search"+"OR u.lastName= :search "+" OR u.email=:search ")
    List<User> search (String search);

}
