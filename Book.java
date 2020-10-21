
public class Book {
	
	private String title;
	private String firstName;
	private String lastName;
	private int year;
	
	public Book(String titleIni, String fName, String lName, int yearIni) {
		title = titleIni == "" || titleIni == null ? "Unknown" : titleIni;
		firstName = fName == "" || fName == null ? "undefined" : fName;
		lastName = lName == "" || lName == null ? "undefined" : lName;
		year = yearIni < 1900 ? 1900 : yearIni;
	}
	
	
	// getter
	
	public String getTitle() {
		return title;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getYear() {
		return year;
	}
	
	
	// setter
	
	public void setTitle(String titleIni) {
		title = titleIni == "" || titleIni == null ? "Unknown" : titleIni;
	}
	
	public void setFirstName(String fName) {
		firstName = fName == "" || fName == null ? "undefined" : fName;
	}
	
	public void setLastName(String lName) {
		lastName = lName == "" || lName == null ? "undefined" : lName;
	}
	
	public void setYear(int yearIni) {
		year = yearIni < 1900 ? 1900 : yearIni;
	}
}
