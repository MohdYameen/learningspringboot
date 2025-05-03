package com.conceptandcoding.learningspringboot.Security;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRegisterEntityRepository extends JpaRepository<UserRegisterEntity, Long> {
    Optional<UserRegisterEntity> findByUsername(String username);
}
