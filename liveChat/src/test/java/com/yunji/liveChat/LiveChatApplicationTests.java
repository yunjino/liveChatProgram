package com.yunji.liveChat;

import com.yunji.liveChat.entity.User;
import com.yunji.liveChat.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LiveChatApplicationTests {
    @Autowired
    private UserService userService;

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
                .build();

        userService.addUser(user);
        User findUser = userService.findById(id);

        Assertions.assertEquals(user.getId(), findUser.getId());
        Assertions.assertEquals(user.getNickname(), findUser.getNickname());
    }
}
