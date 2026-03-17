package com.alphaproject.eduryday.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "submissions")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Submission {

    @Id
    @Column(columnDefinition = "uuid")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignment_id", nullable = false)
    private Assignment assignment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Profile student;

    @Column(name = "student_name", nullable = false)
    private String studentName;

    @Column(name = "student_number")
    private String studentNumber;

    private String content;

    @Column(name = "auto_score")
    private Integer autoScore;

    @Column(name = "final_score")
    private Integer finalScore;

    @Column(name = "tests_passed")
    private String testsPassed;

    @Column(name = "ai_analysis")
    private String aiAnalysis;

    @Column(name = "ai_analysis_variant", nullable = false)
    private String aiAnalysisVariant;

    @Column(name = "ai_sub_note")
    private String aiSubNote;

    @Column(nullable = false)
    private String status;

    @Column(name = "submitted_at", nullable = false)
    private OffsetDateTime submittedAt;

    @Column(name = "graded_at")
    private OffsetDateTime gradedAt;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;
}
