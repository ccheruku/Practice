public class DeepCopyInJava {
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

		// This change will not be reflected in original Student1 'Student11'

		System.out.println(Student11.course.subject3); // Output : Biology
	}
}