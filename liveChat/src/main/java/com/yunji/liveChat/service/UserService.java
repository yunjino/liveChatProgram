package com.yunji.liveChat.service;

import com.yunji.liveChat.entity.User;
import com.yunji.liveChat.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User findById(int id) {
        return userRepository.findById(id).get();
    }
}
