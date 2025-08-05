package com.example.lifeflow.repository;

import com.example.lifeflow.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}