package com.cs.foodhubuserservice.repository;



import com.cs.foodhubuserservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
;


public interface UserRepository extends JpaRepository<User, Long> {

}

