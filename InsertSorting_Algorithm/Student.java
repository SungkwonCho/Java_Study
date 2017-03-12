public class Student implements Comparable{
	
	private String name;
	private int age;
	
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object obj)
	{
		if(name.equals(((Student)obj).getName()))      // If, When names equal
		{
			if(age>(((Student)obj).getAge()))         // Compare ages
				return 1;
			else if (age<(((Student)obj).getAge()))
				return -1;
			else
				return 0;
		}
		else                                          // Else, Compare names
			return name.compareTo(((Student)obj).getName());
	}
	
	
	public String getName(){return name;}
	public int getAge(){return age;}
	
	@Override
	public String toString()
	{
		return "Name: "+name+", Age: "+age;
	}
}
