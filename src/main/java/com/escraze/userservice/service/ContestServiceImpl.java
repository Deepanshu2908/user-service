package com.escraze.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escraze.userservice.entity.Contest;
import com.escraze.userservice.repository.ContestRepository;

@Service
public class ContestServiceImpl implements ContestService {

	@Autowired
	private ContestRepository contestRepository;

	@Override
	public Contest createContest(Contest contest) {
		return contestRepository.save(contest);
	}

	@Override
	public List<Contest> getAllContests() {
		return contestRepository.findAll();
	}
}