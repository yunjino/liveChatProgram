package com.yunji.liveChat.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "message")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String content;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "sender_id", nullable = false)
    private Integer senderId;

    @Column(name = "room_id", nullable = false)
    private Integer roomId;

    @Column
    private String file;
}
