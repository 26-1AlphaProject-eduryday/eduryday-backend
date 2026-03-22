package com.alphaproject.eduryday.repository;

import com.alphaproject.eduryday.entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SubmissionRepository extends JpaRepository<Submission, UUID> {

    List<Submission> findByAssignmentId(UUID assignmentId);

    List<Submission> findByStudentId(UUID studentId);

    List<Submission> findByAssignmentIdAndStatus(UUID assignmentId, String status);
}
