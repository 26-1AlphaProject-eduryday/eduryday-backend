package com.alphaproject.eduryday.repository;

import com.alphaproject.eduryday.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {

    List<Course> findByStatus(String status);

    List<Course> findByCreatedById(UUID profileId);
}
