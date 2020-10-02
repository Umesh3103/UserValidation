package com.learning;

import org.junit.Test;

import org.junit.Assert;


public class UserValidationTest {
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserValidationException{
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.checkFirstName("Umesh@123");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_FIRSTNAME, e.exceptionType);
		}
	}
	
	@Test
	public void givenFirstNameNull_ShouldReturnNull(){
		try{
		String name = null;
		UserValidation validator = new UserValidation();
		boolean flag = validator.checkFirstName(name);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
		
	}
	
	@Test
	public void givenFirstNameEmpty_ShouldReturnEmpty(){
		try{
		String name = "";
		UserValidation validator = new UserValidation();
		boolean flag = validator.checkFirstName(name);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
		}
		
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws UserValidationException{
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.checkLastName("Deora");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_LASTNAME, e.exceptionType);
		}
		
	}
	
	@Test
	public void givenLastNameNull_ShouldReturnNull(){
		try{
			String name = null;
			UserValidation validator = new UserValidation();
			boolean flag = validator.checkLastName(name);
			}catch(UserValidationException e){
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			}
		
	}

	@Test
	public void givenLastNameEmpty_ShouldReturnEmpty(){
		try{
			String name = "";
			UserValidation validator = new UserValidation();
			boolean flag = validator.checkLastName(name);
			}catch(UserValidationException e){
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			}
		
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() throws UserValidationException{
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.checkEmail("abc@gmail.com");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.exceptionType);
		}
	}
	
	@Test
	public void givenEmailNull_ShouldReturnNull(){
		try{
			String email = null;
			UserValidation validator = new UserValidation();
			boolean flag = validator.checkEmail(email);
			}catch(UserValidationException e){
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			}
		
	} 
	
	@Test
	public void givenEmailEmpty_ShouldReturnEmpty(){
		try{
			String email = "";
			UserValidation validator = new UserValidation();
			boolean flag = validator.checkEmail(email);
			}catch(UserValidationException e){
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			}
		
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws UserValidationException{
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.checkMobNum("91 9983910255");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_MOBNUMBER, e.exceptionType);
		}
	}
	
	@Test
	public void givenMobNumberNull_ShouldReturnNull(){
		try{
			String number = null;
			UserValidation validator = new UserValidation();
			boolean flag = validator.checkMobNum(number);
			}catch(UserValidationException e){
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			}
		
	} 
	
	@Test
	public void givenMobNumberEmpty_ShouldReturnEmpty(){
		try{
			String number = "";
			UserValidation validator = new UserValidation();
			boolean flag = validator.checkMobNum(number);
			}catch(UserValidationException e){
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			}
		
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() throws UserValidationException{
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.checkPassword("Umesh@123");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
		}
	}
	
	@Test
	public void givenPasswordNull_ShouldReturnNull(){
		try{
			String pass = null;
			UserValidation validator = new UserValidation();
			boolean flag = validator.checkPassword(pass);
			}catch(UserValidationException e){
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			}
		
	} 
	
	@Test
	public void givenPasswordEmpty_ShouldReturnEmpty(){
		try{
			String pass = "";
			UserValidation validator = new UserValidation();
			boolean flag = validator.checkPassword(pass);
			}catch(UserValidationException e){
				Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			}
		
	}

}

