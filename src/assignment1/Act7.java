package assignment1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Act7 
{
	public static void main (String args[])
	{
	Queue<Object> q1=new LinkedList<Object>();
	System.out.println("enter no of Bangles");
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("enter the bangles");
	for(int i=0;i < n;i++)
	{
		int a=sc.nextInt();
		q1.add(a);
	}
	System.out.println("The actual queue of bangles"+q1);
	
	for(int i=0;i<n;i++)
	{q1.poll();
	System.out.println("After removing bangle one by one:"+q1);
	}
}
}