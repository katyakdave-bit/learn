import java.util.*;
public class Sample2 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();
	HashMap<Character, Integer> map1 = new HashMap<>();
	for(int i =0;i<s1.length();i++)
	{
		char c = s1.charAt(i);
		if(map1.containsKey(c))
		{
			map1.put(c, map1.get(c)+1);
		}
		else
		{
			map1.put(c, 1);
		}
	}
	//System.out.println(map1);
	HashMap<Character, Integer> map2 = new HashMap<>();
	for(int i =0;i<s2.length();i++)
	{
		char c = s2.charAt(i);
		if(map2.containsKey(c))
		{
			map2.put(c, map2.get(c)+1);
		}
		else
		{
			map2.put(c, 1);
		}
	}
	if(map1.equals(map2))
	{
		System.out.println("The two words are anagrams");
	}
	else
	{
		System.out.println("The two words are not anagrams");
	}
	
	sc.close();	
}
}

