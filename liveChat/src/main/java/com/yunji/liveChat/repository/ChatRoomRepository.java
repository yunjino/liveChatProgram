package com.yunji.liveChat.repository;

import com.yunji.liveChat.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository  extends JpaRepository<ChatRoom, Integer> {
}
