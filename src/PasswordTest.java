/*
 * Zachary Miller
 * 03 July 2018
 * assignment 4.1
 * This program gets the user input necessary for the Password class
 * PasswordTest.java
 * Bellevue University
 */
import javax.swing.*;
public class PasswordTest {

	public static void main(String[] args) {
		Password pWord = new Password();
		String password = null;
		boolean correctInput=false, matchingPasswords;
		do
		{
			try
			{
				password = JOptionPane.showInputDialog(null, "Please enter a password (must contain one letter, one number and must be 6-10 digits in length): ");
				correctInput=pWord.checkPasswordRequirement(password);
			}catch(NullPointerException e)
			{
				System.exit(0);
			}
			
		}while(correctInput==false);
		pWord.setFirstInput(password);
		password=null;
		do 
		{
			do 
			{
				try
				{
					password = JOptionPane.showInputDialog(null, "Please re-enter your password : ");
					correctInput=pWord.checkPasswordRequirement(password);
				}catch(NullPointerException e)
				{
					System.exit(0);
				}
				
			}while(correctInput==false);
			pWord.setSecondInput(password);
			matchingPasswords= pWord.checkPasswordMatch();
		}while(matchingPasswords==false);
		JOptionPane.showMessageDialog(null, "Your password is set.");
	}

}
