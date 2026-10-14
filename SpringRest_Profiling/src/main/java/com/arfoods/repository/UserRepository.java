package com.arfoods.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arfoods.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
