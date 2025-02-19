package com.cs.foodhubuserservice.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_activity")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activityId;

    private Long userId;
    private String action;
    private LocalDateTime timestamp;


}

