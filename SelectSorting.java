/**
 * ���� ���� ����
 *  1. �־��� ����Ʈ �� �ּ� ���� ã�´�.
 *  2. �� ���� �� �տ� ��ġ�� ���� ��ü�Ѵ�.
 *  3. �� ó�� ��ġ�� �� ������ ����Ʈ�� ���� ������� ��ü�Ѵ�.
 */

public class SelectSorting {
	
	private Comparable[] list;
	
	public void Sorting(Comparable[] list)
	{
		int min;
		
		for(int i=0;i<list.length-1;i++)
		{
			min = i;
			for(int j = (i+1);j<list.length;j++)
			{
				if(list[j].compareTo(list[min])<0)
				{
					min = j;
				}
			}
			Comparable temp = list[min];
			list[min] = list[i];
			list[i] = temp;
		}
	}
}
