package librarymanagementsystem;

import java.util.Scanner;

public class LibraryOperations {
	static Scanner sc=new Scanner(System.in);

	//this method listed admin panel
	static void admin()
	{
		while(true)
		{
			int choice;
			System.out.println("Press 1.For Add Books\n"
					+ "Press 2.For View All Books Details\n"
					+ "Press 3.For Delete Books Details by id\n"
					+ "Press 4.For Go Back to the Main menu");
			System.out.println("=========================================");
			System.out.println("Enter Your Choice");	
			choice=sc.nextInt();
			System.out.println("=========================================");
			switch(choice)
			{
			case 1:
				LibraryService.addBooks();
				System.out.println("=====================================");
				break;
				
			case 2:
				LibraryService.showBooksDetails();
				System.out.println("=====================================");
				break;
				
			case 3:
				LibraryService.deleteBookById();
				System.out.println("=====================================");
				break;
				
			case 4:
				AdminAndLibrarian.AllOPerations();
			}
		}
	}

	//librarianPanel operation listed here
	static void librarian()
	{
		while(true)
		{
			int choice;
			System.out.println("Press 1.For View Books\n"
					+ "Press 2.For Issue Books\n"
					+ "Press 3.For View Issued Books\n"
					+ "Press 4.For Return Books by id\n"
					+ "Press 5.For Go Back to the Main menu");
			System.out.println("=========================================");
			System.out.println("Enter Your Choice");	
			choice=sc.nextInt();
			System.out.println("=========================================");
			switch(choice)
			{
			case 1:
				LibraryService.showBooksDetails();;
				System.out.println("=====================================");
				break;
				
			case 2:
				LibraryService.issueBooks();
				System.out.println("=====================================");
				break;
				
			case 3:
				LibraryService.viewAllIssuedBook();
				System.out.println("=====================================");
				break;
				
			case 4:
				LibraryService.returnBook();
				System.out.println("=====================================");
				break;
			
			case 5:
				AdminAndLibrarian.AllOPerations();
			}
		}
	}

}
