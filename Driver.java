
public class Driver {
	
	public static void printBooks(Book[] bookArray) {
		for (int i = 0; i < bookArray.length; i++) {
			System.out.println("Title: " + bookArray[i].getTitle() + " " + bookArray[i].getFirstName() + " " + bookArray[i].getLastName() + " " + bookArray[i].getYear());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArray = new Book[3];
		bookArray[0] = new Book("Java", "Smith", "Ema", 1991);
		bookArray[1] = new Book("", "Smith", "Ema", 1991);
		bookArray[2] = new Book("Java", "", "Ema", 1991);
		
		printBooks(bookArray);
		
		bookArray[1].setTitle("JSP");
		bookArray[2].setFirstName("Tom");
		
		System.out.println("\nUpdate value");
		printBooks(bookArray);
	}
}
