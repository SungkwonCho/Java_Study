/**
 * InsertSorting 구현을 위한 Student 객체 
 * Comparable Interface와 Is-A 관계로서 compareTo 오버라이딩 재정의
 *
 */
public class Student implements Comparable{
	private String name;
	private int num;
	
	public Student(String name, int num)
	{
		this.name = name;
		this.num = num;
	}
	
	@Override
	public int compareTo(Object obj)
	{
		if(name.equals(((Student)obj).getName())){  //학생 이름이 같을 시,
			if(((Student)obj).getNum()>num)       //학생 번호를 통해 비교
				return -1;
			else if (((Student)obj).getNum()<num)
				return 1;
			else
				return 0;
		}
		else
			return name.compareTo(((Student)obj).getName());
	}
	
	@Override
	public String toString()
	{
		return "이름: " + name + "나이: "+num;
	}
	
	public String getName(){return name;}
	public int getNum(){return num;}
}
