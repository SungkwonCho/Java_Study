/**
 * 선택 정렬 구현
 *  1. 주어진 리스트 중 최솟 값을 찾는다.
 *  2. 그 값을 맨 앞에 위치한 값과 교체한다.
 *  3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
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
