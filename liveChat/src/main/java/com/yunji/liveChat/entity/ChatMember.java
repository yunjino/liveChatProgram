package com.yunji.liveChat.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "chat_member")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatMember {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "room_id", nullable = false)
    private Integer roomId;

    @Column(nullable = false)
    private Boolean status;
}
