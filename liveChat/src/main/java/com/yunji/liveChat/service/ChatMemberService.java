package com.yunji.liveChat.service;

import com.yunji.liveChat.entity.ChatMember;
import com.yunji.liveChat.repository.ChatMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatMemberService {
    private final ChatMemberRepository chatMemberRepository;

    public void addChatMember(int userId, int roomId) {
        ChatMember chatMember = ChatMember.builder()
                .userId(userId)
                .status(true)
                .roomId(roomId)
                .build();

        chatMemberRepository.save(chatMember);
    }

    public ChatMember findChatMemberByUser(int userId) {
        return chatMemberRepository.findByUserId(userId).get();
    }
}
