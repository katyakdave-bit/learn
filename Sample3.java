import java.util.*;
public class Sample3 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	if(no%2==0)
	{
		System.out.println("The number is even");
	}
	else
	{
		System.out.println("The number is odd");
	}
	sc.close();
}
}
