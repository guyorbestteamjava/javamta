package com.guy.java;
public class MathManager {
	final static  int BASE = 20, EXPONENT = 13,  RADIUS = 50, ANGLE_B = 30, HYPOTENUSE_LENGTH = 50;
	public String circalArea(){
		double circalArea = (RADIUS * RADIUS * Math.PI);
		return "Area of circle with radius: " + RADIUS + " is: " + circalArea + "square­cm.";
	}
	public String oppositeLength(){
		double oppositeLength = HYPOTENUSE_LENGTH * Math.toRadians(ANGLE_B);
		return "Length of opposite where angle B is 30 degrees and Hypotenuse length is 50 cm is: " + oppositeLength + " cm";
	}
	public String calculatePower(){
		long calculatePower = (long) Math.pow((long)BASE,(long)EXPONENT);
		return "Power of 20 with exp of 13 is: " + calculatePower;
	}
	public String getResults(){
		String line1 = "calculation 1: " + circalArea(); 
		String line2 = "calculation 2: " + oppositeLength(); 
		String line3 = "calculation 3: " + calculatePower();
		String resultStr = line1 + "<br>" + line2 + "<br>" + line3;
		return resultStr;
	}
	
}
