import java.util.Scanner;
public class ArrayTest1 
{
public static void main(String args[])
{
 int m,n;
 Scanner sc=new Scanner(System.in);
System.out.println("Enter a number for row:");
 m=sc.nextInt();
 System.out.println("Enter a number for column:");
 n=sc.nextInt();
 int arr[][]=new int[m][n];
 for(int i=0;i<n;i++)
 {
	 for(int j=0;j<n;j++)
	 {
		 arr[i][j]=sc.nextInt();
	 }
 }
 for(int i=0;i<n;i++)
 {
	 for(int j=0;j<n;j++)
	 {
		 System.out.println(arr[i][j]);	 
	 }
}
}
}
