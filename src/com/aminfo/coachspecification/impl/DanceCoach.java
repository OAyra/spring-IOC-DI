package com.aminfo.coachspecification.impl;

import com.aminfo.coachspecification.Coach;
import com.aminfo.toolspecification.ToolKitService;

public class DanceCoach implements Coach {

	ToolKitService toolKitService;

	public DanceCoach() {
		System.out.println("Debug: Dance coach no-args custructor...");
	}
	
	public DanceCoach(ToolKitService toolKitService) {
		System.out.println("Debug: Dance coach 1-args custructor...");
		this.toolKitService = toolKitService;
	}

	@Override
	public String getGuidOfCoach() {
		return "make your body flixable.";
	}

	@Override
	public String getKitPrice() {
		return "costume price: " + toolKitService.completeKitPrice();
	}

}
