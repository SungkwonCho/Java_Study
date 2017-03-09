/**
 * InsertSorting ������ ���� Student ��ü 
 * Comparable Interface�� Is-A ����μ� compareTo �������̵� ������
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
		if(name.equals(((Student)obj).getName())){  //�л� �̸��� ���� ��,
			if(((Student)obj).getNum()>num)       //�л� ��ȣ�� ���� ��
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
		return "�̸�: " + name + "����: "+num;
	}
	
	public String getName(){return name;}
	public int getNum(){return num;}
}
