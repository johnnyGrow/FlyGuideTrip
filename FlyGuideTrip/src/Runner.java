import java.util.Scanner;

public class Runner
	{

		public static void main(String[] args)
			{
				System.out.println("rocks=9");
				System.out.println("fly=8");
				System.out.println("hey let's go fishing");
				System.out.println("ok, we are at the river, lets start fishing");
				System.out.println("(1)Do you want to go where there is visible fish, or (2)make it harder on yourself");
				Scanner userInput=new Scanner(System.in);
				 String answer=userInput.nextLine();
				 makeRiver.makeMatrix();

				 if(answer.equals("1"))
					 {
						 
						makeRiver.wantRocks();
						makeRiver.displayRiver();
						makeRiver.userMove();
					 }
				 else
					 {
				makeRiver.wantRocks();
				makeRiver.displayRiverHiddenFish();
				makeRiver.userMove();
					 }

			}
		
		
		public static void Runner()
		{
			
		}

	}
