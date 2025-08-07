package com.escraze.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.escraze.userservice.entity.Team;
import com.escraze.userservice.entity.TeamPlayer;
import com.escraze.userservice.repository.TeamRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

	private final TeamRepository teamRepository;

	/**
	 * Creates a new fantasy team with associated players.
	 *
	 * @param team the team entity with players
	 * @return the persisted team with generated ID and players
	 */
	@Override
	@Transactional
	public Team createTeam(Team team) {
		if (team == null) {
			throw new IllegalArgumentException("Team cannot be null");
		}

		// Set the reverse relation: each player must know which team they belong to
		if (team.getPlayers() != null) {
			for (TeamPlayer player : team.getPlayers()) {
				player.setTeam(team);
			}
		}

		// Save team with players (CascadeType.ALL ensures players are saved too)
		return teamRepository.save(team);
	}

	/**
	 * Fetch all fantasy teams created by a specific user.
	 *
	 * @param userId the user ID
	 * @return list of teams
	 */
	@Override
	public List<Team> getTeamsByUserId(Long userId) {
		return teamRepository.findByUserId(userId);
	}
}
