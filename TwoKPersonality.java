import java.util.Scanner;
import java.lang.Math;
public class TwoKPersonality
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int counterA = 0; //this is for shooter
		int counterB = 0; //this is for slasher

		/*int counterC = 0; //this is for shot creator
		int counterD = 0; //this is for defender
		*/
		
		




		for (int question = 0; question <= 1; question++) 
		{
			
			System.out.println("This 20 question survey will judge which NBA 2K Archetype best matches your personality."); //prompt
			System.out.println("");
			System.out.println("Question 1: What is most important to you" + System.lineSeparator() + "A) Shooting the 3" + System.lineSeparator() + "B) Drving to the hoop" + System.lineSeparator() + "C) Setting up your teammates" + System.lineSeparator() + "D) Defense " );
			char anwser = scanner.next().charAt(0);
			System.out.println("Question 2: What pro player do you identify with" + System.lineSeparator() + "A) Stephen Curry" + System.lineSeparator() + "B) Russel Westbrook" + System.lineSeparator() + "C) Chris Paul" + System.lineSeparator() + "D) Kawhi Leonard " );
			anwser = scanner.next().charAt(0);

			//the conditional statements below keep track of what the survey taker anwsers.
			//which ever letter he/she picks the most will determine their personality.
			//in the event of a tie i will have a bonus character in place.

			if (anwser == 'A')
			{
				counterA += 1;
			}
			else if (anwser == 'B') //|| (anwser == "b"))
			{
				counterB += 1;
			}
			/*if ((anwser == "C") || (anwser == "c"))
			{
				counterC += 1;
			}
			if ((anwser == "D") || (anwser == "d"))
			{
				counterD += 1;
			}
			*/
	}
		int max = Math.max(counterA,counterB); //the Math.max method only takes in 2 arguements at a time




		if (max == counterA)
		{
    		System.out.println("You are a Shooter");
    	}

		else if (max == counterB)
		{
			System.out.println("You are a Slasher");
		}
		else if (counterA == counterB)
		{
			System.out.println("Balanced");

		}
		/*
		else if (max == counterC)
		{
			System.out.println("You are a Shot Creator");
		}
		else if (max == counterD)
		{
			System.out.println("You are a Slasher");
		}
		*/

		
		

	}
}