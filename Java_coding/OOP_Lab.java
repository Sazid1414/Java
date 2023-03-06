import java.util.Scanner;
public class OOP_Lab 
{
 public static void main(String[] args)
 {
	 Scanner scan=new Scanner (System.in);
	 System.out.println("Enter The Size Of Array:");
	 int size=scan.nextInt();
	 int [] array=new int[size];
	 System.out.println("Enter The Element:");
	 for(int i=0;i<size;i++)
	 {
		 
		 array[i]=scan.nextInt();
	 }
	 scan.close();
	 //Array Before Sorting
	 System.out.println("The Entered Array Is:");
	 for(int i=0;i<array.length;i++)
	 {
		 System.out.println(array[i]);
	 }
	 //Bubble sort
	 
	 for(int i=0;i<array.length;i++)
	 {
		 for(int j=0;j<array.length-i-1;j++)
		 {
			 if(array[j]>array[j+1])
			 {
				 int temp=array[j];
				  array[j]=array[j+1];
				  array[j+1]=temp;
			 }
		 }
	 }
	 //After Sorting
	 System.out.println("The Sorted Array Is:");
	 for(int i=0;i<array.length;i++)
	 {
		 System.out.println(array[i]);
	 }
	 
	 
	 
 }

}


