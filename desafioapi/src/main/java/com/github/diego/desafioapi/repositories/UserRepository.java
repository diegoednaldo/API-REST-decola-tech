package com.github.diego.desafioapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.diego.desafioapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);

}
