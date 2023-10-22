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
        String nickName = "bob";

        User user = User.builder()
                .nickname(nickName)
                .date(new Date())
                .build();

        userService.addUser(user);
        User findUser = userService.findById(user.getId());

        Assertions.assertEquals(user.getId(), findUser.getId());
        Assertions.assertEquals(user.getNickname(), findUser.getNickname());
    }

    @Test
    public void testStartChat() {
        String firstNickName = "bob";
        User firstUser = User.builder()
                .nickname(firstNickName)
                .build();
        userService.addUser(firstUser);

        String secondNickName = "alice";
        User secondUser = User.builder()
                .nickname(secondNickName)
                .build();
        userService.addUser(secondUser);

        String randomTitle = "ran" + Math.random();
        ChatRoom chatRoom = ChatRoom.builder()
                .title(randomTitle)
                .date(new Date())
                .build();
        chatRoomService.addChatRoom(chatRoom);

        chatMemberService.addChatMember(firstUser.getId(), chatRoom.getId());
        chatMemberService.addChatMember(secondUser.getId(), chatRoom.getId());

        ChatMember chatMember = chatMemberService.findChatMemberByUser(firstUser.getId());
        Assertions.assertEquals(chatMember.getRoomId(), chatRoom.getId());
    }
}
