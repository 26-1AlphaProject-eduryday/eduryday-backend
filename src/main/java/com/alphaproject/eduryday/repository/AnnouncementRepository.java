package com.alphaproject.eduryday.repository;

import com.alphaproject.eduryday.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AnnouncementRepository extends JpaRepository<Announcement, UUID> {

    List<Announcement> findByCourseId(UUID courseId);

    List<Announcement> findByCourseIdAndPinnedTrue(UUID courseId);
}
