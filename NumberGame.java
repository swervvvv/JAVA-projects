import java.util.Random;
import java.util.Scanner;
public class NumberGame{
	public static void main(String[] args){
		
		//create 2 random numbers between 0-20
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		int number = random.nextInt(100);
		
		boolean answer = false;
		while(answer != true)
		{
			System.out.println("Pick a number between 1 and 100: ");
			int user = scanner.nextInt(); 
			if (number == user) 
			{
				System.out.println("you got it right");	
				answer = true;
			}
			else if (user > 100) 
			{
				System.out.println("you number is out of the range");
			}
			else 
			{
				answer = false;
				if (number > user) 
				{
					System.out.println("Wrong! Too Low");
					counter += 1;
				}
				else if (number < user) 
				{
					System.out.println("Wrong! Too High");
					counter += 1;
				}

			}
		}
		System.out.println("It took " + (counter + 1) + " guesses");
		
			
		
	}
}