import java.util.Scanner;

public class makeRiver
	{
		static int board[][]=new int [8][8];
		
		
		
		public static void displayRiver()
			{
				System.out.println("     1     2     3");
				System.out.println("  -------------------");
				System.out.println("A |  "+board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  |");
				System.out.println("  |     |     |     |");
				System.out.println("  -------------------");
				System.out.println("B |  "+board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  |");
				System.out.println("  |     |     |     |");
				System.out.println("  -------------------");
				System.out.println("C |  "+board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  |");
				System.out.println("  |     |     |     |");
				System.out.println("  -------------------");
				
			}
		

		
		public static void makeMatrix()
		{
			
			
			for(int r=0; r<8; r++)
				{
					for(int c=0; c<8; c++)
						{
							board[r][c]=0;
						}
				}
			
			int randNumFish=(int)(Math.random()*5);
			
			
			int randomRow=(int)(Math.random()*8);
			int randomCol=(int)(Math.random()*8);
			int fishCounter=1;
			for(int j=0; j<randNumFish;j++)
				{
					board[randomRow][randomCol]=fishCounter;
					fishCounter++;
				}
			
		}
		
		
		
		
		public static void userMove()
			{
				
			int row=0;
				System.out.println("make a cast(ex:A1)");
				Scanner userInput=new Scanner(System.in);
				 String move=userInput.nextLine();
				switch (move.substring(0,1))
				{
				case "a":
				case "A":
						{
							row=0;
							break;
						}
					case "b":
					case "B":
							{
								row=1;
								break;
							}
				case "c":
				case "C":
						{
							row=2;
							break;
						}
				case "d":
				case "D":
					
							{
							row=3;
							break;
							}	
				case "e":
				case "E":
						{
							row=4;
							break;
						}		
				case "f":
				case "F":
							{
							row=5;
							break;
							}
				case "g":
				case "G":
						{
							row=6;
							break;
						}
				case "h":
				case "H":
							{
							row=7;
							break;
							}		
					
			}
				int col=Integer.parseInt(move.substring(1))-1;
				
				for(int j=0; j<board.length; j++ )
			          {

				
				for(int d=0; d<board[0].length; d++)
		            {
		              int matrixRunner = board[j][d];
		              if((row==j-1||row==j) && (col==d))
		              {
		                System.out.println("you hooked a fish!!!");
		              }
		                
		                
		                  
		            
			          }
				
					System.out.println("(1)make another cast or (2) change your fly out ");
					Scanner input=new Scanner(System.in);
					 String decision=input.nextLine();
					if(decision.equals("1"))
						{
							userMove();
						}
					else
						{
							
						}
				}
				
				
				
			}
			}
