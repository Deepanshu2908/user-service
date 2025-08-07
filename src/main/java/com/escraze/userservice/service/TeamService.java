package com.escraze.userservice.service;

import java.util.List;

import com.escraze.userservice.entity.Team;

public interface TeamService {
    Team createTeam(Team team);
    List<Team> getTeamsByUserId(Long userId);
}
