
public class Driver {
	
	public static void printBooks(Book[] bookArray) {
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].getPrice() == -1) {
				System.out.println("Please write the price more than Zero");
			} else {
				System.out.println("Title: " + bookArray[i].getTitle() + " " + bookArray[i].getFirstName() + " " + bookArray[i].getLastName() + " " + bookArray[i].getYear() + " Price=" + bookArray[i].getPrice() + " TotalPrice=" + bookArray[i].getTotalPrice());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArray = new Book[3];
		bookArray[0] = new Book("Java", "Smith", "Ema", 1991, 10.0);
		bookArray[1] = new Book("", "Smith", "Ema", 1991, 2.0);
		bookArray[2] = new Book("Java", "", "Ema", 1991, 11);
		
		printBooks(bookArray);
		
		bookArray[1].setTitle("JSP");
		bookArray[2].setFirstName("Tom");
		
		System.out.println("\nUpdate value");
		printBooks(bookArray);
	}
}
