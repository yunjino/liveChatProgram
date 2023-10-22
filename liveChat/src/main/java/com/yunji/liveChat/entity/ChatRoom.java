package com.yunji.liveChat.entity;

import jakarta.persistence.*;
import lombok.Builder;

import java.util.Date;

@Entity
@Table(name = "chat_room")
@Builder
public class ChatRoom {
    @Id
    private Integer id;

    @Column
    private String title;

    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
}
