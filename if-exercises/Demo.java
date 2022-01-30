import java.util.Scanner;
public class Demo
{
	public static void main(String args[])
	{
		  int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        if(n>0)
        {
            System.out.println("number is positive");    
        }
        else
        {
            System.out.println("number is negative");     
        }
	 }
}
