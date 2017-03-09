/**
 * 삽입정렬을 위한 클래스 구현
 *  => 정렬되지 않은 목록의 첫번째 요소부터 정렬된 목록과 비교를 통해 
 *     적절한 위치에 삽임해 나가는 알고리즘
 */  


public class InsertSorting {
	
	private Comparable[] list;  //객체 비교를 위한 Comparable 인터페이스 선언
	
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
