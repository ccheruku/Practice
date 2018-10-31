class Course {
	String subject1;

	String subject2;

	String subject3;

	public Course(String sub1, String sub2, String sub3) {
		this.subject1 = sub1;

		this.subject2 = sub2;

		this.subject3 = sub3;
	}
	 protected Object clone() throws CloneNotSupportedException
	    {
	        return super.clone();
	    }
}

class Student1 implements Cloneable {
	int id;

	String name;

	Course course;

	public Student1(int id, String name, Course course) {
		this.id = id;

		this.name = name;

		this.course = course;
	}

	// Default version of clone() method. It creates shallow copy of an object.

	/*protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}*/
	
	//Overriding clone() method to create a deep copy of an object.
	 
    protected Object clone() throws CloneNotSupportedException
    {
        Student1 student = (Student1) super.clone();
 
        student.course = (Course) course.clone();
 
        return student;
    }
}

public class ShallowCopyInJava {
	public static void main(String[] args) {
		Course science = new Course("Physics", "Chemistry", "Biology");

		Student1 Student11 = new Student1(111, "John", science);

		Student1 Student12 = null;

		try {
			// Creating a clone of Student11 and assigning it to Student12
			Student12 = (Student1) Student11.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Printing the subject3 of 'Student11'

		System.out.println(Student11.course.subject3); // Output : Biology

		// Changing the subject3 of 'Student12'

		Student12.course.subject3 = "Maths";

		// This change will be reflected in original Student1 'Student11'

		System.out.println(Student11.course.subject3); // Output : Maths
	}
}