package com.yunji.liveChat.repository;

import com.yunji.liveChat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
