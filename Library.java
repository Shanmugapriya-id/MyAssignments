package methods.objects;

public class Library {
	    String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	void issueBook() {
		System.out.println("Book issued successfully");
	}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library book = new Library();
		String titledisplay = book.addBook("LIFE IS BEAUTIFULL");
		book.issueBook();

	}

}
// syntax for creating object and passing the arguments to method and calling the method with object created