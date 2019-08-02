import java.util.*;

public class Passwords
{
	public static void main(String[] args)
	{
		//establish the length of your password
		int length = 8;

		System.out.println(rand_Password(length));
	}
	static char[] rand_Password(int len)
	{
		
		System.out.println("Your new password is : ");

		//show all of the available characters that can be used for your password
		String capt_chars = "ABCDEFGHIJKLMNOPQRZTUVWXYZ";
		String small_chars = "abcdefghijklmnopqrztuvwxyz";
		String numbers = "1234567890";
		String symbols = "!@#$%&*?=+_-<>";

		//add the variables together because the generated password will include each type of character
		String value = capt_chars + small_chars +numbers + symbols;

		//this is basically used to scrambel all of your characters
		Random random_method = new Random();
		char[] password = new char[len];
		 for (int i = 0; i < len; i++) 
        { 
            // Use of charAt() method : to get character value 
            // Use of nextInt() as it is scanning the value as int 
            password[i] = value.charAt(random_method.nextInt(value.length())); 
  
        } 
        return password; 
	}
}