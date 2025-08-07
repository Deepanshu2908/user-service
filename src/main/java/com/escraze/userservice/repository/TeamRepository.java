package com.escraze.userservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.escraze.userservice.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
	@Query("SELECT t FROM Team t LEFT JOIN FETCH t.players WHERE t.userId = :userId")
	List<Team> findByUserId(@Param("userId") Long userId);
}
