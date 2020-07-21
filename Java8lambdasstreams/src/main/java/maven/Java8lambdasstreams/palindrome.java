package maven.Java8lambdasstreams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class palindrome {
	public static void main(String args[])
	{
	List<String> List = Arrays.asList("aba","String","amma","Array","Madam","dad","Pop");
	List<String> list1 = IsPalindrome(List);
	for(String i:list1)
	
		System.out.println(i);
		
}
	static List<String> IsPalindrome(List<String> l)
	{
		List<String> List2=new ArrayList<String>();
		for(String i:l)
		{
			String t=i.replaceAll("\\s+","").toLowerCase();
			if(IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!=t.charAt(t.length()-j-1)))
				List2.add(i);
		}
		return List2;
		
	}
}



