package com.ict.ecomApp.dao;

import com.ict.ecomApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select p from User p where p.username = ?")
    User getUserByUserName(String userName);

    @Query("select p from User p where p.id = ?")
    User getUserById(Integer userId);
}