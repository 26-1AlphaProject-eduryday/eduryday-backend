package com.alphaproject.eduryday.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Entity
@Table(name = "activity_logs")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_role")
    private String userRole;

    @Column(nullable = false)
    private String message;

    private String ip;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;
}
