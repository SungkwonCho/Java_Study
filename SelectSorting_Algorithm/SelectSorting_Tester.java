import java.util.ArrayList;

public class SelectSorting_Tester {
	
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		Student student1 = new Student("John", 23);
		Student student2 = new Student("Jack", 22);
		Student student3 = new Student("David", 11);
		Student student4 = new Student("Jack", 11);
		Student student5 = new Student("Steve", 43);
		
		Comparable[] student_list = {student1, student2, student3, student4, student5};  // Comparable arry's list
		
		SelectSorting.sorting_Select(student_list);
		
		for(Comparable student : student_list)
		{
			System.out.println(student.toString());
		}

	}
}
