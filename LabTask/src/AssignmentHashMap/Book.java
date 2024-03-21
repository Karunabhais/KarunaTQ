package AssignmentHashMap;

public class Book {
	int bookid;
	String bname,author;
	double price;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	

	public Book(int bookid, String bname, String author, double price) {
		super();
		this.bookid = bookid;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	

	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
   

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}

}
