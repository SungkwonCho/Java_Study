public class InsertSorting{
	
	public static void sorting_Insert(Comparable[] array)   //
	{
		Comparable key = null;
		
		for(int i=1; i<array.length; i++)
		{
			key = array[i];
			int position = i;
			
			while(position>0 && key.compareTo(array[position-1])<0)
			{
				array[position] = array[position-1];
				position--;
			}
			array[position] = key;
		}
	}
}
