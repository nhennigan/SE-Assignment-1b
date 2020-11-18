import java.util.ArrayList;

import org.joda.time.DateTime;

public class DriverClass {

	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<Student> students = new ArrayList<Student>();

	public DriverClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Student student1 = new Student("Niamh",22,new DateTime(1998,12,31,0,0),1234567);
		Student student2 = new Student("Mary",21,new DateTime(1999,8,21,0,0),3456789);
		Student student3 = new Student("John",21,new DateTime(1999,9,20,0,0),5678901);
		Student student4 = new Student("Conor",30,new DateTime(1990,2,2,0,0),5678901);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		Module module1 = new Module("Programming 4", 1234);
		Module module2 = new Module("Software Engineering 3", 5678);
		Module module3 = new Module("Digital Signals Processing", 9012);
		Module module4 = new Module("System on Chip Design", 3456);
		Module module5 = new Module("Telecommunictions", 7890);

		Course course1 = new Course("Engineering", new DateTime(2020,9,1,0,0),new DateTime(2021,5,31,0,0));
		Course course2 = new Course("Computer Science", new DateTime(2020,9,1,0,0),new DateTime(2021,5,31,0,0));

		courses.add(course1);
		courses.add(course2);

		module1.setStudents(student1);
		module1.setStudents(student2);
		module1.setStudents(student3);

		module2.setStudents(student4);
		module2.setStudents(student1);
		module2.setStudents(student2);

		module3.setStudents(student1);
		module3.setStudents(student2);
		module3.setStudents(student3);
		module3.setStudents(student4);

		module4.setStudents(student4);
		module4.setStudents(student3);

		module5.setStudents(student1);

		course1.setModules(module1);
		course1.setModules(module2);
		course1.setModules(module3);

		course2.setModules(module3);
		course2.setModules(module4);
		course2.setModules(module5);

		printOut();
	}

	public static void printOut() {
		for (Course c: courses) {
			ArrayList<Module> cModules = c.getModules();
			System.out.println(
					c.toString() + "Modules in this course:"); 
			for (Module m : cModules) {
				System.out.println(m + "\nStudents enrolled in module:\n"+m.getStudents());
			}
		}
		System.out.println("\n\nStudents information:");
		for (Student s: students) {
			System.out.println(
					s.toString() + 
					",\nModules registered for:" + s.getModules()+
					",\nCourses enrolled in:" + s.getCourses());
		}
	}

}