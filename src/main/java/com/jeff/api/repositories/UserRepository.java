package com.jeff.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeff.api.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
