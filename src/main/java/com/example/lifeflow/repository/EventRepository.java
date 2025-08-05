package com.example.lifeflow.repository;

import com.example.lifeflow.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}