package com.yunji.liveChat.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "user")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nickname;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
}
