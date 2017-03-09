/**
 * SelectSorting 구현을 위한 Card 객체 
 * Comparable Interface와 Is-A 관계로서 compareTo 오버라이딩 재정의
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
		if(name.equals(((Card)obj).getName())){  // 이름이 같을 시,
			if(number>((Card)obj).getNumber())   // 번호 값을 통한 비교
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
