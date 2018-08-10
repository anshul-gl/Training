package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Practice for square cut for about 10 minutes";
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getFortunes() {
		return this.fortuneService.getFortune();
	}
	
}
