package com.example.lifeflow.repository;

import com.example.lifeflow.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}