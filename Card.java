/**
 * SelectSorting ������ ���� Card ��ü 
 * Comparable Interface�� Is-A ����μ� compareTo �������̵� ������
 *
 */

public class Card implements Comparable {
	private String name;
	private int number;
	
	public Card(String name, int number)
	{
		this.name = name;
		this.number = number;
	}
	
	public String getName(){return name;}
	public int getNumber(){return number;}
	
	@Override
	public int compareTo(Object obj)
	{
		if(name.equals(((Card)obj).getName())){  // �̸��� ���� ��,
			if(number>((Card)obj).getNumber())   // ��ȣ ���� ���� ��
				return 1;
			else if (number<((Card)obj).getNumber())
				return -1; 
			else
				return 0;
		}
		else
			return name.compareTo(((Card)obj).getName());
	}
	
	public String toString()
	{
		return "Name: "+name+", Age: "+number;
	}
}
