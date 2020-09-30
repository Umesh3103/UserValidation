package com.learning;

import java.util.regex.Pattern;

public class UserValidation {
	private static final Pattern FIRST_NAME = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
	private static final Pattern LAST_NAME = Pattern.compile("[A-Z]{1}[a-z]{2,}");
	private static final Pattern EMAIL = Pattern.compile("^[0-9 a-z A-Z]+([_+-.]{0,1}[0-9 a-z A-Z]+[@][0-9 a-z A-Z]+[.][a-z A-Z]{2,4})([.][a-z A-Z]{2,4}){0,1}");
	private static final Pattern MOBILE_NUMBER = Pattern.compile("^[0-9]{2}\\s[6-9]{1}[0-9]{9}");
	private static final Pattern PASSWORD = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[_+-.@#$])([a-z A-Z 0-9]).{5,}");
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Validation Problem");
	}
	public String AnalyseMood(String mood){
		if(mood.contains("sad")){
			return "SAD";
		}
		else{
			return "HAPPY";
		}
	}
	public boolean checkFirstName(String name) {
        return FIRST_NAME.matcher(name).matches();
    }
	
	public boolean checkLastName(String name) {
        return LAST_NAME.matcher(name).matches();
    }

	public boolean checkEmail(String name) {
        return EMAIL.matcher(name).matches();
    }
	
	public boolean checkMobNum(String name) {
        return MOBILE_NUMBER.matcher(name).matches();
    }
	
	public boolean checkPassword(String name) {
        return PASSWORD.matcher(name).matches();
    }

}

