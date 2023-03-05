package librarymanagementsystem;

import java.time.LocalDate;
import java.util.Scanner;

public class LibraryService {
	//this is book array of type BookDetails class,will store book details	
	static BookDetails book[]=new BookDetails[10];

	//this is bookissue details array of type BookIssueDetails class,will store bookissue details
	static BookIssueDetails bookIssue[]=new BookIssueDetails[10];

	static Scanner sc=new Scanner(System.in);
	static int index=0;        // array index of book array
	static int issueindex=0;   // array index of book issue array
	static int issueId=1;

	//this method is responsible to add books in the array
	static void addBooks()
	{
		System.out.println("Enter Book Id:");
		int bookId=sc.nextInt();
		
		sc.nextLine();   //it will consume the \n character

		System.out.println("Enter Book Name:");
		String bookName=sc.nextLine();
		System.out.println("Enter Book Author:");
		String bookAuthor=sc.nextLine();
		System.out.println("Enter Book Publisher:");
		String bookPublisher=sc.nextLine();
		System.out.println("Enter ISBNCode:");
		String ISBNCode=sc.nextLine();
		System.out.println("Enter the number of books");
	    int noOfBooks=sc.nextInt();
		
		//will insert in an array
		book[index]=new BookDetails(bookId,bookName,bookAuthor,bookPublisher,ISBNCode,noOfBooks);
	    index++; 
		System.out.println("\nBook has been added successfully!!");
	}	

	//this method is responsible to retrieve books details
	static void showBooksDetails()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("Book Id:"+book[i].getBookId());
			System.out.println("Book Name:"+book[i].getBookName());
			System.out.println("Book Author:"+book[i].getBookAuthor());
			System.out.println("Book Publisher:"+book[i].getBookPublisher());
			System.out.println("Book ISBNCode:"+book[i].getISBNCode());
			System.out.println("Available No. of Books: "+book[i].getNoOfBooks());
			System.out.println("=================================================");	
		}
	}

	//this method is responsible to issue book 
	static void issueBooks()
	{
		boolean status=false;
		sc.nextLine();
		System.out.println("Enter Author Name:");
		String name=sc.nextLine();
		System.out.println("=========================================");
		
		//display books for issue
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookAuthor().equalsIgnoreCase(name))
			{
				System.out.println("Book Id:"+book[i].getBookId());
				System.out.println("Book Name:"+book[i].getBookName());
				System.out.println("Book Author:"+book[i].getBookAuthor());
				System.out.println("Book Publisher:"+book[i].getBookPublisher());
				System.out.println("Book ISBNCode:"+book[i].getISBNCode());
				System.out.println("Number of Books:"+book[i].getNoOfBooks());
				System.out.println("=========================================");
				status=true;
			}
		}
		
		//issue book by id
		if(status==true)
		{
			System.out.println("Enter Book Id, for Issue Book:");
	   		int id=sc.nextInt();
	   		
	   		sc.nextLine();
	   		
	   		System.out.println("Enter Date of Issue Book :");
	   		LocalDate issueDate =LocalDate.parse(sc.nextLine());
	   		
	   		System.out.println("Enter Date of Return book :");
	   		LocalDate returnDate =LocalDate.parse(sc.nextLine());
	   		
	   		for(int i=0;i<index;i++)
	   		{
	   			if(book[i].getBookId()==id)
	   			{
	   				if(book[i].getNoOfBooks()>0) 
	   				{
	   					System.out.println("\nBook has been Issued successfully!!");
	   					
	   					System.out.println("\n~~Book  Issue Details:~~");
	   					System.out.println("Book Id:"+id);
	   	   				System.out.println("Book Name:"+book[i].getBookName());
	   	   				System.out.println("Book Author:"+book[i].getBookAuthor());
	   	   			    System.out.println("Book Publisher:"+book[i].getBookPublisher());
	   				    System.out.println("Book ISBNCode:"+book[i].getISBNCode());
	   	   				System.out.println("Book Issued Date: "+ issueDate);
	   	   				System.out.println("Book Return Date:"+ returnDate);
	   	   				
	   	   			    System.out.println("\nYou have to return Book Before "+returnDate+" else pay fine!!\n"
	   	   			   		+ "\nThank You!!!");
	   	   			    System.out.println("==============================================================");
	   	   			    
	   	   		        //no. of book will reduce
	   	   			    book[i].setNoOfBooks((book[i].getNoOfBooks()-1));
	   	   		       
	   	   			    // this will store the book issue details into the bookissue array.
	   	   			    bookIssue[issueindex] = new BookIssueDetails(issueId, book[i].getBookName(), book[i].getBookAuthor(), book[i].getBookPublisher(), book[i].getISBNCode(), issueDate, returnDate);
	   	   			    issueindex++;
	   	   			    issueId++;
	   	   			    break;
	   	   			 }
	   			}		
	   		}
		}
		else
			System.out.println("Book is not Available!!!");
	}

	//this method is responsible to show all issued book
	static void viewAllIssuedBook()
	{
		  System.out.println("\t~~Issued Books~~");
		  for(int i=0;i<issueindex;i++)
		  {
			  System.out.println("Book Issued Id:"+bookIssue[i].getIssueId());
			  System.out.println("Book Name:"+bookIssue[i].getBookName());
			  System.out.println("Book Author:"+bookIssue[i].getAuthor());
			  System.out.println("Book Publisher:"+bookIssue[i].getPublisher());
			  System.out.println("Book ISBNCode:"+bookIssue[i].getISBNCode());
			  System.out.println("Book Issued Date:"+bookIssue[i].getIssueDate());
			  System.out.println("Book Return Date:"+bookIssue[i].getReturnDate());
			  System.out.println("==============================================================");			    
		  }
	}

	//this method is responsible to return Book
	static void returnBook()
	{
		boolean status=false;
		System.out.println("Enter the Issued Book Id to return book");
		int id=sc.nextInt();
		for(int i=0;i<issueindex;i++) 
		{
			if(id==bookIssue[i].getIssueId())  
			{
				for(int j=0;j<issueindex;j++) 
				{
					//increasing the stock in book array during cancellation
					book[j].setNoOfBooks(book[j].getNoOfBooks()+1);
				}	
			}
			//this code id for delete book issued details from an array
			for(int k=i;k<issueindex;k++) 
			{
				bookIssue[k]=bookIssue[k+1];	
			}
			issueindex--;
			System.out.println("Book has been returned successfully!!!");
			System.out.println("================================================================");
			status=true;
			break;
		}
		if(status == false) 
		{
			System.out.println("Issued Book Id not found!!!!!!");
		    System.out.println("====================================================================");
	    }
	}

	//this method is responsible to delete book details by id
	static void deleteBookById()
	{
		boolean status=false;
		System.out.println("Enter book id to delete book from the library");
		int id = sc.nextInt();
		for(int i=0;i<index;i++) 
		{
			if(id==book[i].getBookId())
			{
				for(int j=i;j<index-1;j++) 
				{
					// this will shift the index of book forward by one when one book is deleted
					book[j]=book[j+1];
				}
				index--;
				System.out.println("Book has been removed successfully!!!");
				status=true;
				break;
			}		
		}
		if(status==false) 
		{
			System.out.println("Book Id not found!!!!");
			System.out.println("========================================================");
		}
	}

}
