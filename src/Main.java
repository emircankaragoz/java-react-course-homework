
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Emircan", "Java", 33, "Best Course Ever!" );
		Course course2 = new Course(2, "Can", "Python", 75, "Great Course!" );
		Course course3 = new Course(3, "Engin", "JS", 99, "It's very nice." );
	
		Course[] coruses = {course1,course2,course3};
		
		for (Course course : coruses) {
			System.out.println(course.author);
			
		}
		
		Category category1 = new Category(1, "Engineering");
		Category category2 = new Category(2, "Design");
		Category category3 = new Category(3, "Programming");
		
		Category[] categories = {category1,category2,category3};
		
		for (Category category : categories) {
			System.out.println(category.name);
		}

		CourseManager courseManager = new CourseManager();
		
		courseManager.addCourse(course1,"Yeni Kurs Eklendi: ");
		
		courseManager.addCourse(course2, "Tebrikler! Bir yeni kurs eklediniz: ");
		
		courseManager.deleteCourse(course3);
		

	}

}
