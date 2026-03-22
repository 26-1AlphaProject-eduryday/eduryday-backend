package com.alphaproject.eduryday.repository;

import com.alphaproject.eduryday.entity.ActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityLogRepository extends JpaRepository<ActivityLog, Long> {

    List<ActivityLog> findByType(String type);

    List<ActivityLog> findByUserName(String userName);
}
