package com.example.lifeflow.repository;

import com.example.lifeflow.model.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<GroupEntity, Long> {
}