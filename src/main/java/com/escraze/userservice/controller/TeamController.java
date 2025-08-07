package com.escraze.userservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escraze.userservice.entity.Team;
import com.escraze.userservice.service.TeamService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/teams")
@RequiredArgsConstructor
public class TeamController {

	private final TeamService teamService;

	@PostMapping
	public Team create(@RequestBody Team team) {
		return teamService.createTeam(team);
	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Team>> getByUser(@PathVariable Long userId) {
		List<Team> teams = teamService.getTeamsByUserId(userId);
		return ResponseEntity.ok(teams);
	}

}
