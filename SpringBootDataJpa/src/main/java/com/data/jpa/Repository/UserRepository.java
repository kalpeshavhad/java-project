package com.data.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
