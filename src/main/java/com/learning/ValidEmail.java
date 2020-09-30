package com.learning;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
import org.junit.Test;

@RunWith(Parameterized.class)
public class ValidEmail {
	private boolean expectedResult;
	private String email;
	public ValidEmail(String email, boolean expectedResult) {
		super();
		// TODO Auto-generated constructor stub
		this.expectedResult=expectedResult;
		this.email=email;
	}
	@Parameterized.Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][] { {"abc@yahoo.com", true},
		{"abc-100@yahoo.com",true},
		{"abc.100@yahoo.com",true},
		{"abc111@abc.com",true},
		{"abc-100@abc.net",true},
		{"abc.100@abc.com.au",true},
		{"abc@1.com",true},
		{"abc@gmail.com.com",true},
		{"abc+100@gmail.com",true},
		{"abc",false},
		{"abc@.com.my",false},
		{"abc123@gmail.a",false},
		{"abc123@.com",false},
		{".abc@abc.com",false},
		{"abc()*@gmail.com",false},
		{"abc@%*.com",false},
		{"abc..2002@gmail.com",false},
		{"abc.@gmail.com",false},
		{"abc@abc@gmail.com",false},
		{"abc@gmail.com.1a",false},
		{"abc@gmail.com.aa.au",false}});
		
	}
	@Test
	public void givenEmail_WhenValid_ShoultReturnTrue(){
		UserValidation validator = new UserValidation();
		boolean result = validator.checkEmail(this.email);
		Assert.assertEquals(this.expectedResult, result);
	}
	
}
