package com.aminfo.coachspecification.impl;

import com.aminfo.coachspecification.Coach;
import com.aminfo.toolspecification.ToolKitService;

public class CricketCoach implements Coach {

	private ToolKitService toolKit;
	private String cricketCoachEmailId;

	private String name;
	private Integer age;
	private Integer experiance;

	public CricketCoach() {
		System.out.println("Debug: cricket coach no-args custructor...\n");
	}

	public void setToolKit(ToolKitService toolKit) {
		System.out.println("Debug: setter method called in cricket coach to inject dependancy...\n");
		this.toolKit = toolKit;
	}

	public void setCricketCoachEmailId(String cricketCoachEmailId) {
		System.out.println("Debug: email id inside setter...\n");
		this.cricketCoachEmailId = cricketCoachEmailId;
	}

	public String getCricketCoachEmailId() {
		return cricketCoachEmailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Debug: setting Name from properties file: coach.properties...");
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		System.out.println("Debug: setting age from properties file: coach.properties...");
		this.age = age;
	}

	public Integer getExperiance() {
		return experiance;
	}

	public void setExperiance(Integer experiance) {
		System.out.println("Debug: setting Experiance from properties file: coach.properties...\n");
		this.experiance = experiance;
	}

	@Override
	public String getGuidOfCoach() {
		return "Please improve batting.";
	}

	@Override
	public String getKitPrice() {
		return "Cricket toolkit price: " + toolKit.completeKitPrice();
	}

}
