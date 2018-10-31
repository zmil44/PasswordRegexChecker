/*
 * Zachary Miller
 * 03 July 2018
 * assignment 4.1
 * This program will get two passwords from PasswordTest class and then check to see if it matches the requirements and then determine if the passwords match each other
 * Password.java
 * Bellevue University
 */
import java.util.regex.*;

public class Password {
	String firstInput;
	String secondInput;
	Pattern letter = Pattern.compile("[a-zA-z]");//used example from https://coderanch.com/t/583177/java/validate-string-characters-letter-number
	Pattern digit = Pattern.compile("[0-9]");//used example from https://coderanch.com/t/583177/java/validate-string-characters-letter-number
	Pattern length = Pattern.compile(".{6,10}");//got example from https://coderanch.com/t/583177/java/validate-string-characters-letter-number
	public void setFirstInput(String input)
	{
		firstInput=input;
	}
	
	public void setSecondInput(String input)
	{
		secondInput=input;
	}
	
	public boolean checkPasswordRequirement(String password)
	{
		//used example from https://coderanch.com/t/583177/java/validate-string-characters-letter-number
		Matcher hasLetter = letter.matcher(password);
		Matcher hasDigit = digit.matcher(password);
		Matcher hasLength = length.matcher(password); 
		return(hasLetter.find()&&hasDigit.find()&&hasLength.find());
	}
	
	public boolean checkPasswordMatch()
	{
		if(firstInput.equals(secondInput))
		{
			return true;
		}
		else
			return false;
	}
	
}
