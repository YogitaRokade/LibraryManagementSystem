package librarymanagementsystem;

import java.util.Scanner;

public class AdminAndLibrarian {

	static Scanner sc=new Scanner(System.in);

	//this method responsible for All Operations
	static void AllOPerations()
	{
		int choice;
		do	
		{
			System.out.println("------------------------------------------");
			System.out.println("Press 1.For Admin Panel\n"
					+ "Press 2.For Librarian Panel\n"
					+ "Press 3.For Quit");
			System.out.println("------------------------------------------"); 
			System.out.println("Enter Your Choice");			
			choice=sc.nextInt();
			System.out.println("=========================================");    
			switch(choice)
			{
			case 1:
				LibraryOperations.admin();
				break;
				
			case 2:
				LibraryOperations.librarian();
				break;
				
			case 3:System.exit(0);
			default:System.out.println("Please enter correct choice from operations!!");
		   }
		   }//do
		while(choice!=3);
	}		
}
