package com.escraze.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escraze.userservice.entity.Contest;
import com.escraze.userservice.service.ContestService;

@RestController
@RequestMapping("/api/contests")
public class ContestController {

	@Autowired
	private ContestService contestService;

	@PostMapping
	public Contest createContest(@RequestBody Contest contest) {
		return contestService.createContest(contest);
	}

	@GetMapping
	public List<Contest> getAllContests() {
		return contestService.getAllContests();
	}
}