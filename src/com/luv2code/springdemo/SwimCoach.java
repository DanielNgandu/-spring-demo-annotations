package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
//	@Autowired
//	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
     
	@Value("${foo.team}")
	private String team;

	public SwimCoach() {
		// TODO Auto-generated constructor stub
	}

	public SwimCoach(String email, String team) {
		super();
		this.email = email;
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
