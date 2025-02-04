package com.example.demo_sbb.repository;

import com.example.demo_sbb.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<UserEntity, Long> {
}
