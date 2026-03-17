package com.alphaproject.eduryday.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "courses")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Course {

    @Id
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(name = "professor_name", nullable = false)
    private String professorName;

    @Column(nullable = false)
    private String semester;

    private String section;

    @Column(name = "student_count", nullable = false)
    private Integer studentCount;

    @Column(name = "current_week", nullable = false)
    private Integer currentWeek;

    @Column(name = "total_weeks", nullable = false)
    private Integer totalWeeks;

    @Column(nullable = false)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by")
    private Profile createdBy;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;
}
