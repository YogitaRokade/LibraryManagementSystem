package librarymanagementsystem;

// java bean class
public class BookDetails {

	private int bookId;            //id
	private String bookName;       //title
	private String bookAuthor;     //author
	private String bookPublisher;  //press
	private String ISBNCode;       //standard ISBN code
	private int noOfBooks;         //Quantity

	public BookDetails(int bookId, String bookName, String bookAuthor, String bookPublisher, String ISBNCode,
			int noOfBooks) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.ISBNCode = ISBNCode;
		this.noOfBooks = noOfBooks;
	}
	public BookDetails() {
		super();
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public String getISBNCode() {
		return ISBNCode;
	}
	public void setISBNCode(String ISBNCode) {
		this.ISBNCode = ISBNCode;
	}
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	@Override
	public String toString() {
		return "BookDetails [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookPublisher=" + bookPublisher + ", ISBNCode=" + ISBNCode + ", noOfBooks=" + noOfBooks + "]";
}
}