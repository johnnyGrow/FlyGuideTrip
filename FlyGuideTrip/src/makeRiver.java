import java.util.Scanner;

public class makeRiver
	{
		static boolean hooked=false;
		static int fishCounter=1;
		static int board[][]=new int [8][8];
		
		
		public static void wantRocks()
		{
			System.out.println("Do you want rocks in the river?(1)yes or (2)No");
			Scanner userInput=new Scanner(System.in);
			 String move=userInput.nextLine();
			 if(move.equals("1"))
				 {
					 int randomRow=(int)(Math.random()*8);
						int randomCol=(int)(Math.random()*8);
						
						board[randomRow][randomCol]= 8008;
				 }
		}
		
		public static void displayRiverHiddenFish()
			{
				System.out.println("     1     2     3     4     5     6     7     8");
				System.out.println("  -------------------------------------------------");
				System.out.println("A |     |     |     |     |     |     |     |     |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("B |     |     |     |     |     |     |     |     |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("C |     |     |     |     |     |     |     |     |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("D |     |     |     |     |     |     |     |     |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("E |     |     |     |     |     |     |     |     |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("F |     |     |     |     |     |     |     |     |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("G |     |     |     |     |     |     |     |     |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("H |     |     |     |     |     |     |     |     |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
			}
		
		
		
		
		
		public static void displayRiver()
			{
				System.out.println("     1     2     3     4     5     6     7     8");
				System.out.println("  -------------------------------------------------");
				System.out.println("A |  "+board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  |  "+board[0][3]+"  |  "+board[0][4]+"  |  "+board[0][5]+"  |  "+board[0][6]+"  |  "+board[0][7]+"  |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("B |  "+board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  |  "+board[1][3]+"  |  "+board[1][4]+"  |  "+board[1][5]+"  |  "+board[1][6]+"  |  "+board[1][7]+"  |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("C |  "+board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  |  "+board[2][3]+"  |  "+board[2][4]+"  |  "+board[2][5]+"  |  "+board[2][6]+"  |  "+board[2][7]+"  |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("D |  "+board[3][0]+"  |  "+board[3][1]+"  |  "+board[3][2]+"  |  "+board[3][3]+"  |  "+board[3][4]+"  |  "+board[3][5]+"  |  "+board[3][6]+"  |  "+board[3][7]+"  |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("E |  "+board[4][0]+"  |  "+board[4][1]+"  |  "+board[4][2]+"  |  "+board[4][3]+"  |  "+board[4][4]+"  |  "+board[4][5]+"  |  "+board[4][6]+"  |  "+board[4][7]+"  |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("F |  "+board[5][0]+"  |  "+board[5][1]+"  |  "+board[5][2]+"  |  "+board[5][3]+"  |  "+board[5][4]+"  |  "+board[5][5]+"  |  "+board[5][6]+"  |  "+board[5][7]+"  |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("G |  "+board[6][0]+"  |  "+board[6][1]+"  |  "+board[6][2]+"  |  "+board[6][3]+"  |  "+board[6][4]+"  |  "+board[6][5]+"  |  "+board[6][6]+"  |  "+board[6][7]+"  |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
				System.out.println("H |  "+board[7][0]+"  |  "+board[7][1]+"  |  "+board[7][2]+"  |  "+board[7][3]+"  |  "+board[7][4]+"  |  "+board[7][5]+"  |  "+board[7][6]+"  |  "+board[7][7]+"  |  ");
				System.out.println("  |     |     |     |     |     |     |     |     |");
				System.out.println("  -------------------------------------------------");
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
			
			int randNumFish=(int)(Math.random()*5)+1;
			
			
			int randomRow=(int)(Math.random()*8);
			int randomCol=(int)(Math.random()*8);
			
			for(int j=0; j<randNumFish;j++)
				{
					board[randomRow][randomCol]=fishCounter;
					fishCounter++;
				}
			
			if(hooked=true)
				{
			switch (fishCounter-1)
			{
			case 1:
		
					{
						System.out.println("HINT: its a small fish you dont have to worry about brweaking the line or fly off");
						break;
					}
			case 2:
				
					{
						System.out.println("HINT: its not a small fish try to keep your rod tip up");
						break;
					}
			case 3:
				
					{
						System.out.println("HINT: this fish is a good size maybe 18 inches, dont break the line");
						break;
					}
			case 4:
				
					{
						System.out.println("HINT: dang that fish is fat, dont let him get in the current or else you are done for");
						break;
					}
			case 5:
				
					{
						System.out.println("HINT: this fish is huge and a fighter, good luck!");
						break;
					}
					
			}
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
				
				
				int fishRow=0;
				int fishCol=0;
				
				
				int smallest=(int)(Math.random()*1)+1;
				int medium=(int)(Math.random()*1)+1;
				int mediumLarge=(int)(Math.random()*1)+1;
				int big=(int)(Math.random()*1)+1;
				int huge=(int)(Math.random()*1)+1;
				
				
				for(int j=0; j<board.length; j++ )
			          {

				
				for(int d=0; d<board[0].length; d++)
		            {
		              
		            	int matrixRunner = board[j][d];
		                
		            	if(matrixRunner!=0)
		            		{
		            			fishRow=j;
		            			fishCol=d;
		            			
		            			if((row==fishRow-1||row==fishRow) && (col==fishCol))
			      		              {
			      		            	System.out.println("you hooked a fish!!!");
			      		            	  
			      		            	  if(fishCounter==1&&smallest==1)
			      		            		  {
			      		            			  System.out.println("you caught a fish");
			      		            		  }

				      		            	
			      		            	  else if(fishCounter==2&&medium==1)
			      		            		{
			      		            			System.out.println("you caught a fish");
			      		            		}

			      		            	
			      		            	  else if(fishCounter==3&&mediumLarge==1)
			      		            		{
			      		            			System.out.println("you caught a fish");
			      		            		}

			      		            	
			      		            	  else if(fishCounter==4&&big==1)
			      		            		{
			      		            			System.out.println("you caught a fish");
			      		            		}

			      		            	
			      		            	  else if(fishCounter==5&&huge==1)
			      		            		{
			      		            			System.out.println("you caught a fish");
			      		            		}
			      		            	
			      		            	else
			      		            		{
			      		               System.out.println("you fought a good fight, but the fish won");
			      		            		}
			      		              }
		            			System.out.println("wanna keep fishing? (1)yes (2)no");
		    					Scanner input1=new Scanner(System.in);
		    					 String decision1=input1.nextLine();
		            			if(decision1.equals("1"))
				            		{
				            		
				    						
				    							userMove();
				    						
				    					
				            		}
		            			else
		    						{
		    							System.out.println("goodbye");
		    						}
				            	
				            	}
		            		}
		            
			          }
				
					
				}
				
				
//				for(int i=0; i<board.length; i++ )
//			        {
//
//				
//				for(int b=0; b<board[0].length; b++)
//		            	{
//		            	int matrixRunner = board[i][b];
//		            	if(matrixRunner!=0)
//		            		{
//		            			
//		            			if((row==i-1||row==i) && (col==b))
//		      		              {
//		      		                System.out.println("you hooked a fish!!!");
//		      		              }
//		            			
//		            			
//		            		}
		            	
		         //   }
				
				
				
				
				
				
				
				
			}
		
