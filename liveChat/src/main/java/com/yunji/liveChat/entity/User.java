package com.yunji.liveChat.entity;

import jakarta.persistence.*;
import lombok.Builder;

import java.util.Date;

@Entity
@Table(name = "user")
@Builder
public class User {
    @Id
    private Integer id;

    @Column
    private String nickname;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
}
