package com.escraze.userservice.service;

import java.util.List;

import com.escraze.userservice.entity.Contest;

public interface ContestService {
	Contest createContest(Contest contest);

	List<Contest> getAllContests();
}