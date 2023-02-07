package courseRegister;

public class tester {
	public static void main(String[] args) 
	{
		student stu=new student();
		stu.setStudentName("peter");
		stu.setRegistrationId(5001);
		stu.setQualifyingMarks(78);
		stu.setCourseId(1005);
		stu.setHostelRequired(false);
		stu.calculateCourseFee();
		if(!stu.validateMarks())
		{
			System.out.println("Marks is less than 65 . You are not eligible for admission!");
		}
		else if(!stu.validateCourseId())
		{
			System.out.println("Invalid Course Id. Please try again!");
		}
		else
			{
		System.out.println("****************** Course Allocation Details ******************");
		System.out.println("Student name : "+stu.getStudentName());
		System.out.println("Course Id : "+stu.getCourseId());
		System.out.println("Qualifying Exam Marks : "+stu.getQualifyingMarks());
		System.out.println("Student's Registration Id : "+stu.getRegistrationId());
		System.out.println("Total course Fee : "+stu.getCourseFee());
		if(stu.ishostelRequired()) {
		System.out.println("Hostel Required : Yes");
		}
		else
			System.out.println("Hostel Required : No");
			}
	}
}