package com.learning;

import org.junit.Test;

import org.junit.Assert;

@SuppressWarnings("deprecation")
public class UserValidationTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad(){
		UserValidation validator = new UserValidation();
		String mood = validator.AnalyseMood("This is a sad message");
		Assert.assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy(){
		UserValidation validator = new UserValidation();
		String mood = validator.AnalyseMood("This is a happy message");
		Assert.assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkFirstName("Umesh");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkFirstName("Um");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFalse(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkFirstName("Um@12esh");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkLastName("Deora");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkLastName("De");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkLastName("De12#%ora");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkEmail("abc@gmail.com");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkEmail("abc.@gmail.com");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenEmail_WhenOptionalPart1_ShouldReturnTrue(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkEmail("abc.xyz@gmail.com");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenEmail_WhenOptionalPart2_ShouldReturnTrue(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkEmail("abc@gmail.com.in");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkMobNum("91 9983910255");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenMobileNumber_WhenNotProper_ShouldReturnFalse(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkMobNum("9123 9983910255");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkPassword("Umesh@123");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkPassword("umesh@123");
		Assert.assertFalse(result);
	}
}

