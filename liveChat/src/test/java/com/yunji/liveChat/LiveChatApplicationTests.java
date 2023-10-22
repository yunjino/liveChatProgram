package com.yunji.liveChat;

import com.yunji.liveChat.entity.ChatMember;
import com.yunji.liveChat.entity.ChatRoom;
import com.yunji.liveChat.entity.User;
import com.yunji.liveChat.service.ChatMemberService;
import com.yunji.liveChat.service.ChatRoomService;
import com.yunji.liveChat.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class LiveChatApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private ChatRoomService chatRoomService;
    @Autowired
    private ChatMemberService chatMemberService;

    @Test
    void contextLoads() {
    }

    @Test
    public void testAddUser() {
        int id = 1;
        String nickName = "bob";

        User user = User.builder()
                .id(id)
                .nickname(nickName)
                .date(new Date())
                .build();

        userService.addUser(user);
        User findUser = userService.findById(id);

        Assertions.assertEquals(user.getId(), findUser.getId());
        Assertions.assertEquals(user.getNickname(), findUser.getNickname());
    }

    @Test
    public void testStartChat() {
        int firstId = 1;
        String firstNickName = "bob";
        User firstUser = User.builder()
                .id(firstId)
                .nickname(firstNickName)
                .build();
        userService.addUser(firstUser);

        int secondId = 2;
        String secondNickName = "alice";
        User secondUser = User.builder()
                .id(secondId)
                .nickname(secondNickName)
                .build();
        userService.addUser(secondUser);

        int roomID = 1;
        String randomTitle = "ran" + Math.random();
        ChatRoom chatRoom = ChatRoom.builder()
                .id(1)
                .title(randomTitle)
                .date(new Date())
                .build();
        chatRoomService.addChatRoom(chatRoom);

        chatMemberService.addChatMember(firstId, roomID);
        chatMemberService.addChatMember(secondId, roomID);

        ChatMember chatMember = chatMemberService.findChatMemberByUser(firstId);
        Assertions.assertEquals(chatMember.getRoomId(), roomID);
    }
}
