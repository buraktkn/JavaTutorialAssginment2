package lecture2HW;

public class Main {

	public static void main(String[] args) {
		CourseManager courseManager = new CourseManager();
		Course course1 = new Course(1, "C# + Angular","Engin Demiro�");
		Course course2 = new Course(2, "Java + React ","Engin Demiro�");
		Course course3 = new Course(3, "Programlamaya Giri�","Engin Demiro�");
		
		Course[] courses = {course1,course2,course3};
		System.out.println("The name of course is "+ course1.name );
		System.out.println("The instructor of course is "+ course1.instructor);
	}

}
