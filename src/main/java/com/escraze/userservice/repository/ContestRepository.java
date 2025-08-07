package com.escraze.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escraze.userservice.entity.Contest;

public interface ContestRepository extends JpaRepository<Contest, Long> {
}