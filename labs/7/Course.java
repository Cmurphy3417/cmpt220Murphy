//Lab7_Problem10_9
public class Course
{
	private String courseName;
	private String[] students= new String[100];
	private int numberOfStudents;
	
	public Course(String courseName)
	{
		this.courseName = courseName;
	}
	public void addStudent(String student)
	{
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String[] getStudents()
	{
		return students;
	}
	public int getNumOfStudents()
	{
		return numberOfStudents;
	}
	public String getCourseName()
	{
		return courseName;
	}
	public void dropStudent(String student)
	{
		int count=0;
		String[]temp=new String[numberOfStudents--];
		for(String s: students)
		{
			if(s.equals(student))
			{
				continue;
			}
			temp[count]=s;
			count++;
		}
		students = temp;
	}
	public void clear()
	{
		String[]temp=new String[1];
		students= temp;
		numberOfStudents = 0;
	}
	
}
	
		