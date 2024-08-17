package week1.day2;

public class Library {
	
	
	public String addBook(String bookTitle) {
		return bookTitle;
	}

	public void issueBook() {
	}{
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library l=new Library();
		System.out.println(l.addBook("Book added successfully"));
		l.issueBook();

	}

}
