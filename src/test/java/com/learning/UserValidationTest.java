package com.learning;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;


public class UserValidationTest {
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserValidationException{
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.firstName.validation("Umesh");
		Assert.assertTrue(result);	
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_FIRSTNAME, e.exceptionType);
		}
	}
	@Test
	public void givenFirstNameNull_ShouldReturnNull(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.firstName.validation(null);
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
		
	}
	@Test
	public void givenFirstNameEmpty_ShouldReturnEmpty(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.firstName.validation("");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
		}
		
	}
	@Test
	public void givenLastNameProper_ShouldReturnTrue(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.lastName.validation("Deora");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_LASTNAME, e.exceptionType);
		}
		
	}
	@Test
	public void givenLastNameNull_ShouldReturnNull(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.lastName.validation(null);
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
		
	}
	@Test
	public void givenLastNameEmpty_ShouldReturnEmpty(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.lastName.validation("");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
		}
		
	}
	@Test
	public void givenEmailProper_ShouldReturnTrue(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.email.validation("abc@gmail.com");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.exceptionType);
		}
		
	}
	@Test
	public void givenEmailNull_ShouldReturnNull(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.email.validation(null);
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
		
	}
	@Test
	public void givenEmailEmpty_ShouldReturnEmpty(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.email.validation("");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
		}
		
	}
	@Test
	public void givenPasswordProper_ShouldReturnTrue(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.passWord.validation("Umesh123@");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
		}
		
	}
	@Test
	public void givenPasswordNull_ShouldReturnNull(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.passWord.validation(null);
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
		
	}
	@Test
	public void givenPasswordEmpty_ShouldReturnEmpty(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.passWord.validation("");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
		}
		
	}
	@Test
	public void givenMobileNumberProper_ShouldReturnTrue(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.mobileNumber.validation("91 6394071789");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.INVALID_MOBNUMBER, e.exceptionType);
		}
		
	}
	@Test
	public void givenMobileNumberNull_ShouldReturnNull(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.mobileNumber.validation(null);
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
		
	}
	@Test
	public void givenMobileNumberEmpty_ShouldReturnEmpty(){
		try{
		UserValidation validator = new UserValidation();
		boolean result = validator.mobileNumber.validation("");
		Assert.assertTrue(result);
		}catch(UserValidationException e){
			Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
		}
		
	}
}

