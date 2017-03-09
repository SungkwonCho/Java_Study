/**
 * ���������� ���� Ŭ���� ����
 *  => ���ĵ��� ���� ����� ù��° ��Һ��� ���ĵ� ��ϰ� �񱳸� ���� 
 *     ������ ��ġ�� ������ ������ �˰���
 */  


public class InsertSorting {
	
	private Comparable[] list;  //��ü �񱳸� ���� Comparable �������̽� ����
	
	public void sorting(Comparable[] list)
	{
		for(int index = 1; index < list.length; index++)
		{
			int position = index;
			Comparable key = list[index];
			
			while(position>0 && key.compareTo(list[position-1])<0) 
			{
				list[position] = list[position-1];
				position--;
			}
			list[position] = key;
		}
	}
}
