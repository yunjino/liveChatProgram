package com.yunji.liveChat.service;

import com.yunji.liveChat.entity.ChatRoom;
import com.yunji.liveChat.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatRoomService {
    private final ChatRoomRepository chatRoomRepository;

    public void addChatRoom(ChatRoom chatRoom) {
        chatRoomRepository.save(chatRoom);
    }
}
