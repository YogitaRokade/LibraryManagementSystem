package librarymanagementsystem;

import java.time.LocalDate;

public class BookIssueDetails {

	private int issueId;	
	private String bookName;
	private String author;
	private String publisher;
	private String ISBNCode;
	private LocalDate issueDate;
	private LocalDate returnDate;

	public BookIssueDetails(int issueId, String bookName, String author, String publisher, String ISBNCode, LocalDate issueDate,
			LocalDate returnDate) {
		super();
		this.issueId = issueId;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.ISBNCode = ISBNCode;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getISBNCode() {
		return ISBNCode;
	}

	public void setISBNCode(String iSBNCode) {
		ISBNCode = iSBNCode;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "BookIssueDetails [issueId=" + issueId + ", bookName=" + bookName + ", author=" + author + ", publisher="
				+ publisher + ", ISBNCode=" + ISBNCode + ", issueDate=" + issueDate + ", returnDate=" + returnDate + "]";
	}

}
