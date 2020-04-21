import java.util.Scanner;

public class Github_Project {

	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter the element in array :- ");
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(i);
			arr[i] = sc.nextInt(); 
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("element in array :- "+arr[i]);
		}
		

	}

}
