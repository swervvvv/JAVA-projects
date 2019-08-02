import java.util.Random;
import java.util.Scanner;
public class randomNumber{
	public static void main(String[] args){
		
		//create 2 random numbers between 0-20
		Random number = new Random();
		int num1;
		int num2;
		num1 = number.nextInt(100);
		//System.out.println(num1 +" ");
		num2 = number.nextInt(100);

		//butt
		

		//Name List for word problem to choose from
		Random subject = new Random();
		String name[] ={"Peter","Kyle","Andre","Jackson","Greg","Kevin","Donnie","Fred","Alexander","Vic"};
		int sub1 = subject.nextInt(name.length);
		//System.out.println(name[sub1]+" ");
		int sub2 = subject.nextInt(name.length);

		//Object List(pluarl)
		Random objects = new Random();
		String things[] ={"apples","tacos","toy cars","candles","brownies","cans of soda","slices of pizza","boneless wings","hats","pencils"};
		int objs = objects.nextInt(things.length);
		//System.out.println(things[obj1]+" ");

		//Object List(single)
		Random object = new Random();
		String thing[] ={"apple","taco","toy car","candle","brownie","can of soda","slice of pizza","boneless wing","hat","pencil"};
		int obj = object.nextInt(things.length);
		//System.out.println(things[obj1]+" ");
		
		
		//Word Problem
		String problem = " "; //turn the problem into a variable
		int answer;
		int user;
		int score;
			for (int counter = 0; counter <= 10 ; counter++) { 
				 do{
						if (sub1 != sub2 && num1 > num2) {
							problem = (name[sub1] + " has " + num1 + " " + things[objs] + ". "+ name[sub2] + " has "+ num2 + " " + things[objs] + ". How many more " + things[objs] + " does " + name[sub1] + " have than " + name[sub2] + " ?");
							System.out.println(problem);
							answer = num1-num2;
							

							//subtraction
							Scanner sc = new Scanner(System.in);
							System.out.println("What is the answer: ");
							user = sc.nextInt();
							
							if (user == answer) {
								System.out.println("Good Job");
							}
							else{
								System.out.println("Wrong!");
								}
							
						}//end of loop 1


						if (sub1 != sub2 && num2 > num1) {
							problem  = (name[sub1] + " has " + num1 + " " + things[objs] + ". "+ name[sub2] + " has "+ num2 + " " + things[objs] + ". How many more " + things[objs] + " does " + name[sub2] + " have than " + name[sub1] + " ?");
							System.out.println(problem);
							answer = num2-num1;


							//subtraction
							Scanner sc = new Scanner(System.in);
							
							System.out.println("What is the answer: ");
							user = sc.nextInt();
							if (user == answer) {
								System.out.println("Good Job");
								
							}
							else{
								System.out.println("Wrong!");
								
							}
						}//end of loop 2

						if (sub1 == sub2 || num1 == num2){
							System.out.println("These are equal");
						}
					}while(counter != 10);  
				}
			



	}
}