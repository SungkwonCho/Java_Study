public class SelectSorting {

	public static void sorting_Select(Comparable[] array)
	{
		for(int i=0; i<array.length-1; i++)
		{
			int min = i;
			for(int scan = min+1; scan<array.length; scan++)
			{
				if(array[scan].compareTo(array[min])<0)
				{
					min = scan;
				}
			}
			Comparable temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}
}
