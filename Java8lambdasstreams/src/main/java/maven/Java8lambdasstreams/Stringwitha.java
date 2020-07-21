package maven.Java8lambdasstreams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stringwitha{
	public static void main(String args[])
	{
	List<String> values= Arrays.asList("abc","honey","anu","shiva","a","niki","amma","actor");
	System.out.println(values);
	
    System.out.println("string starts with a and lenght is exactly 3 :");
	List<String> list2 = filters(values);
	for(String i:list2)
		System.out.println(i);
	}
	
	public static List<String> filters(List <String> List)
	{
		return List.stream()
				.filter((p)->p.startsWith("a")&&p.length()==3)
				.collect(Collectors.toList());
	}
}
