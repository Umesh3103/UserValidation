package com.learning;

import java.util.regex.Pattern;
@FunctionalInterface
interface Name{
	boolean validation(String firstName) throws UserValidationException;
}
public class UserValidation {
	private static final Pattern FIRST_NAME = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
	private static final Pattern LAST_NAME = Pattern.compile("[A-Z]{1}[a-z]{2,}");
	private static final Pattern EMAIL = Pattern.compile("^[0-9 a-z A-Z]+([_+-.]{0,1}[0-9 a-z A-Z]+[@][0-9 a-z A-Z]+[.][a-z A-Z]{2,4})([.][a-z A-Z]{2,4}){0,1}");
	private static final Pattern MOBILE_NUMBER =Pattern.compile("^[0-9]{2}\\s[6-9]{1}[0-9]{9}");
	private static final Pattern PASSWORD = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[_+-.@#$])([a-z A-Z 0-9]).{5,}");
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Validation Problem");
	}
	
	Name firstName= (name)->{
		try{
			if(name.length()==0){
				throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_EMPTY, "Enter proper message");
			}
			boolean flag = FIRST_NAME.matcher(name).matches();
			if(flag){
				return flag;
			}
			else{
				throw new UserValidationException(UserValidationException.ExceptionType.INVALID_FIRSTNAME, "Enter proper message");
			}
		}catch(NullPointerException e){
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_NULL, "Enter proper message");
		}
	};
	Name lastName= (name)->{
		try{
			if(name.length()==0){
				throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_EMPTY, "Enter proper message");
			}
			boolean flag = LAST_NAME.matcher(name).matches();
			if(flag){
				return flag;
			}
			else{
				throw new UserValidationException(UserValidationException.ExceptionType.INVALID_LASTNAME, "Enter proper message");
			}
		}catch(NullPointerException e){
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_NULL, "Enter proper message");
		}
	};
	Name email= (name)->{
		try{
			if(name.length()==0){
				throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_EMPTY, "Enter proper message");
			}
			boolean flag = EMAIL.matcher(name).matches();
			if(flag){
				return flag;
			}
			else{
				throw new UserValidationException(UserValidationException.ExceptionType.INVALID_EMAIL, "Enter proper message");
			}
		}catch(NullPointerException e){
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_NULL, "Enter proper message");
		}
	};
	Name passWord= (name)->{
		try{
			if(name.length()==0){
				throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_EMPTY, "Enter proper message");
			}
			boolean flag = PASSWORD.matcher(name).matches();
			if(flag){
				return flag;
			}
			else{
				throw new UserValidationException(UserValidationException.ExceptionType.INVALID_PASSWORD, "Enter proper message");
			}
		}catch(NullPointerException e){
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_NULL, "Enter proper message");
		}
	};
	Name mobileNumber= (name)->{
		try{
			if(name.length()==0){
				throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_EMPTY, "Enter proper message");
			}
			boolean flag = MOBILE_NUMBER.matcher(name).matches();
			if(flag){
				return flag;
			}
			else{
				throw new UserValidationException(UserValidationException.ExceptionType.INVALID_MOBNUMBER, "Enter proper message");
			}
		}catch(NullPointerException e){
			throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_NULL, "Enter proper message");
		}
	};
}

