package com.aminfo.coachspecification.impl;

import com.aminfo.coachspecification.Coach;
import com.aminfo.toolspecification.ToolKitService;

public class FootballCoach implements Coach {

	ToolKitService toolKitService;
	
	public FootballCoach() {
		System.out.println("Debug: creating bean for Football coach...\n");
	}
	
	public FootballCoach(ToolKitService toolKitService) {
		this.toolKitService = toolKitService;
	}

	@Override
	public String getGuidOfCoach() {
		return "Run fast and hit the ball.";
	}

	@Override
	public String getKitPrice() {
		return "Football kit price: " + toolKitService.completeKitPrice();
	}

	public void doPlayersStartUpStuff() {
		System.out.println("Debug: Hi players get up and start practice...\n");
	}
	
	public void doCleanUpStuff() {
		System.out.println("Debug: Hi players leave the ground, ground need a clean up...\n");
	}
}
