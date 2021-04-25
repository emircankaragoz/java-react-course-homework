
public class Course {
	
	int id;
	String author;
	String name;
	int percentage;
	String detail;
	
	// Simple Constructor
	public Course() {
		System.out.println("Simple Construtor");
	}
	
	// My Constructor
	public Course(int id, String author, String name, int percentage, String detail) {
		this.id = id;
		this.author = author;
		this.name = name;
		this.percentage = percentage;
		this.detail = detail;
		
	}
	
	
}
