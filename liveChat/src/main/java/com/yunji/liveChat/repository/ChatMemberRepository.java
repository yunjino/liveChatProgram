package com.yunji.liveChat.repository;

import com.yunji.liveChat.entity.ChatMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChatMemberRepository extends JpaRepository<ChatMember, Integer> {
    public Optional<ChatMember> findByUserId(int userId);
}
