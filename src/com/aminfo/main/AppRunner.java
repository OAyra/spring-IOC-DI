package com.aminfo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aminfo.coachspecification.Coach;
import com.aminfo.coachspecification.impl.CricketCoach;
import com.aminfo.coachspecification.impl.DanceCoach;
import com.aminfo.coachspecification.impl.FootballCoach;

public class AppRunner {

	public static void main(String[] args) {
		
		/*1. loading spring config file */
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*2. Retrieving bean from spring IC container */
		Coach danceCoach = ctx.getBean("danceCoachImplimantation", Coach.class);
		CricketCoach cricketCoach = (CricketCoach) ctx.getBean("cricketCoachImplimantation", Coach.class);
		
		/*3. calling method */
		String coachMsg = danceCoach.getGuidOfCoach();
		System.out.println("Dance Coach Msg: " + coachMsg + "\n");
		
		/*4. calling dependent class method */
		System.out.println(danceCoach.getKitPrice());
		
		/* properties file configuration */
		String cricketCoachMsg = cricketCoach.getGuidOfCoach();
		System.out.println("EmailId:"+cricketCoach.getCricketCoachEmailId()+" ,msg: "+cricketCoachMsg);
		System.out.println("Coach Name is:"+cricketCoach.getName()+", age: "+cricketCoach.getAge()+", Experiance: "+cricketCoach.getExperiance());
		System.out.println(cricketCoach.getKitPrice() + "\n");
		
		/*5. scope example: creating bean for Singleton scope 2 times but it will create only one bean and share the ref. */
		FootballCoach footballCoach = (FootballCoach) ctx.getBean("footballCoachImpl", Coach.class);
		FootballCoach footballCoach1 = (FootballCoach) ctx.getBean("footballCoachImpl", Coach.class);
		System.out.println("is both bean having same reference in singleton scope: " + (footballCoach == footballCoach1));
		
		/*6. scope example: creating bean for Prototype scope 2 times and it will create new bean each time. */
		System.out.println("Debug: creating prototype scope beans on request.");
		FootballCoach footballCoachProtoType = (FootballCoach) ctx.getBean("footballCoachPrototypeImpl", Coach.class);
		FootballCoach footballCoachProtoType1 = (FootballCoach) ctx.getBean("footballCoachPrototypeImpl", Coach.class);
		System.out.println("is both bean having same reference in prototype scope: " + (footballCoachProtoType == footballCoachProtoType1));
		
		ctx.close();
	}
}
