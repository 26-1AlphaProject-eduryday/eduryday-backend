package com.alphaproject.eduryday.repository;

import com.alphaproject.eduryday.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AssignmentRepository extends JpaRepository<Assignment, UUID> {

    List<Assignment> findByCourseId(UUID courseId);

    List<Assignment> findByCourseIdAndStatus(UUID courseId, String status);
}
