package maven.Java8lambdasstreams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Average {

	public static void main(String args[])
	{
		List<Integer> list1 = new ArrayList<>(
				Arrays.asList(1,2,3,4,5)
				);
		List<Integer> list2 = new ArrayList<>(
				Arrays.asList(11,12,13,14,15)
				);
         list1.addAll(list2);
        
	System.out.println("list of numbers ="+Arrays.deepToString(list1 .toArray()))	;
	average((list1));
}
private static int average(List<Integer> list)
{
	    Integer sum = 0;
		for(Integer values:list)
		{
			sum = sum + values;
		}
        int average = sum / list.size();
		System.out.println(average);
		return average;
		}
}