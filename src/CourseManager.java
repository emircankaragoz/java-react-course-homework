
public class CourseManager {
	
	 String message;
	
	public void addCourse(Course course, String message) {
		this.message = message;
		System.out.println(message + ": " + course.name);
	}
	
	public void deleteCourse(Course course) {
		System.out.println("Kurs silindi: " + course.name);
	}
		

}
