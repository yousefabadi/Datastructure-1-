package dataAssiignment1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;


public class QueueNStack {
	
	static int ex1 = 1000;
	static int ex2 = 10000;
	static int ex3 = 50000;
	static int ex4 = 100000;
	static int ex5 = 1000000;
	
	private static int z1= 240;
	private static int z2= 500;
	private static int z3= 780;
	private static int z4= 2500;
	private static int z5= 6400;
	private static int z6= 8700;
	private static int z7= 23000;
	private static int z8= 33000;
	private static int z9= 43500;
	private static int z10= 35000;
	private static int z11= 67000;
	private static int z12= 83000;
	private static int z13= 285000;
	private static int z14= 610000;
	private static int z15= 798000;
	
	private static int x1= 291;
	private static int x2= 588;
	private static int x3= 860;
	private static int x4= 1888;
	private static int x5= 6469;
	private static int x6= 9448;
	private static int x7= 11190;
	private static int x8= 35905;
	private static int x9= 49212;
	private static int x10= 20493;
	private static int x11= 49590;
	private static int x12= 90938;
	private static int x13= 268442;
	private static int x14= 797498;
	private static int x15= 914727;
	
	private static int c1= 110;
	private static int c2= 208;
	private static int c3= 992;
	private static int c4= 6710;
	private static int c5= 6250;
	private static int c6= 9482;
	private static int c7= 12612;
	private static int c8= 18205;
	private static int c9= 39257;
	private static int c10= 54005;
	private static int c11= 42004;
	private static int c12= 79254;
	private static int c13= 725290;
	private static int c14= 577505;
	private static int c15= 334033;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("                ******Queue******");
		
		Queue <Integer> q1 = new LinkedList <Integer> ();
		Queue <Integer> q2 = new LinkedList <Integer> ();
		Queue <Integer> q3 = new LinkedList <Integer> ();
		Queue <Integer> q4 = new LinkedList <Integer> ();
		Queue <Integer> q5 = new LinkedList <Integer> ();
		
		// Files
        File file1 = new File("1st-Dataset.txt");
        File file2 = new File("2nd-Dataset.txt");
        File file3 = new File("3rd-Dataset.txt");
        File file4 = new File("4th-Dataset.txt");
        File file5 = new File("5th-Dataset.txt");
        
        //Arrays
        int Array1[] = new int[ex1];
        int Array2[] = new int[ex2];
        int Array3[] = new int[ex3];
        int Array4[] = new int[ex4];
        int Array5[] = new int[ex5];
        
      //Fetch the elements from the file and save them into Array
        FileReader fr1 = new FileReader("1st-Dataset.txt");
        int i1 = 0;
        try{
        	Scanner input = new Scanner(fr1);
        	while (input.hasNext())
        	{
        		Array1[i1] = input.nextInt();
        		i1++;
        	}
        	input.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        
 		 
        FileReader fr2 = new FileReader("2nd-Dataset.txt");
        int i2 = 0;
        try{
        	Scanner input = new Scanner(fr2);
        	while (input.hasNext())
        	{
        		Array2[i2] = input.nextInt();
        		i2++;
        	}
        	input.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        

        FileReader fr3 = new FileReader("3rd-Dataset.txt");
        int i3 = 0;
        try{
        	Scanner input = new Scanner(fr3);
        	while (input.hasNext())
        	{
        		Array3[i3] = input.nextInt();
        		i3++;
        	}
        	input.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }

 		 
        FileReader fr4 = new FileReader("4th-Dataset.txt");
        int i4 = 0;
        try{
        	Scanner input = new Scanner(fr4);
        	while (input.hasNext())
        	{
        		Array4[i4] = input.nextInt();
        		i4++;
        	}
        	input.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
 		
 		 
 		
        FileReader fr5 = new FileReader("5th-Dataset.txt");
        int i5 = 0;
        try{
        	Scanner input = new Scanner(fr5);
        	while (input.hasNext())
        	{
        		Array5[i5] = input.nextInt();
        		i5++;
        	}
        	input.close();
        }
        catch(Exception e)
        {
 			 e.printStackTrace();
        }
		
        
		//Random r = new Random();
		
        // Creation process
		long q1start = System.currentTimeMillis();
		for (int a: Array1)
		{
			q1.add(a);
		}
		long q1end = System.currentTimeMillis();
		
		long q2start = System.currentTimeMillis();
		for (int a:Array2)
		{
			q2.add(a);
		}
		long q2end = System.currentTimeMillis();
		
	
		long q3start = System.currentTimeMillis();
		for (int a: Array3)
		{
			q3.add(a);
		}
		long q3end = System.currentTimeMillis();
		
		
		long q4start = System.currentTimeMillis();
		for (int a: Array4)
		{
			q4.add(a);
		}
		long q4end = System.currentTimeMillis();
		
		
		long q5start = System.currentTimeMillis();
		for (int a: Array5)
		{
			q5.add(a);
		}
		long q5end = System.currentTimeMillis();
		
		System.out.println("The creation time for queue 1 is : "+ (q1end-q1start));
		System.out.println("The creation time for queue 2 is : "+ (q2end-q2start));
		System.out.println("The creation time for queue 3 is : "+ (q3end-q3start));
		System.out.println("The creation time for queue 4 is : "+ (q4end-q4start));
		System.out.println("The creation time for queue 5 is : "+ (q5end-q5start));
		
		// queue insertion 
		
		Queue <Integer> insq1 = new LinkedList <Integer> ();
		insq1.addAll(q1);
		Queue <Integer> insq2 = q2;
		insq2.addAll(q2);
		Queue <Integer> insq3 = q3;
		insq3.addAll(q3);
		Queue <Integer> insq4 = q4;
		insq4.addAll(q4);
		Queue <Integer> insq5 = q5;
		insq5.addAll(q5);
		
		long insq1start = System.nanoTime();
		insq1.add(z1);
		insq1.add(z2);
		insq1.add(z3);
		long insq1end = System.nanoTime();
		
		long insq2start = System.nanoTime();
		insq2.add(z4);
		insq2.add(z5);
		insq2.add(z6);
		long insq2end = System.nanoTime();
		
		long insq3start = System.nanoTime();
		insq3.add(z9);
		insq3.add(z8);
		insq3.add(z7);
		long insq3end = System.nanoTime();
		
		long insq4start = System.nanoTime();
		insq4.add(z10);
		insq4.add(z11);
		insq4.add(z12);
		long insq4end = System.nanoTime();
		
		long insq5start = System.nanoTime();
		insq5.add(z13);
		insq5.add(z14);
		insq5.add(z15);
		long insq5end = System.nanoTime();
		
		System.out.println("\nThe time for insert in q1 is : "+(insq1end - insq1start)+ " ns");
		System.out.println("The time for insert in q2 is : "+(insq2end - insq2start)+ " ns");
		System.out.println("The time for insert in q3 is : "+(insq3end - insq3start)+ " ns");
		System.out.println("The time for insert in q4 is : "+(insq4end - insq4start)+ " ns");
		System.out.println("The time for insert in q5 is : "+(insq5end - insq5start)+ " ns");
		
		// queue deletion
		
		Queue <Integer> delq1 = new LinkedList <Integer> ();
		delq1.addAll(q1);
		Queue <Integer> delq2 = q2;
		delq2.addAll(q2);
		Queue <Integer> delq3 = q3;
		delq3.addAll(q3);
		Queue <Integer> delq4 = q4;
		delq4.addAll(q4);
		Queue <Integer> delq5 = q5;
		delq5.addAll(q5);
		
		long delq1start = System.nanoTime();
	    delq1.poll();
	    delq1.poll();
	    delq1.poll();
		long delq1end = System.nanoTime();
		
		long delq2start = System.nanoTime();
		delq2.poll();
		delq2.poll();
		delq2.poll();
		long delq2end = System.nanoTime();
		
		long delq3start = System.nanoTime();
		delq3.poll();
		delq3.poll();
		delq3.poll();
		long delq3end = System.nanoTime();
		
		long delq4start = System.nanoTime();
		delq4.poll();
		delq4.poll();
		delq4.poll();
		long delq4end = System.nanoTime();
		
		long delq5start = System.nanoTime();
		delq5.poll();
		delq5.poll();
		delq5.poll();
		long delq5end = System.nanoTime();
		
		System.out.println("\nThe time for remove from q1 is : "+(delq1end - delq1start)+ " ns");
		System.out.println("The time for remove from q2 is : "+(delq2end - delq2start)+ " ns");
		System.out.println("The time for remove from q3 is : "+(delq3end - delq3start)+ " ns");
		System.out.println("The time for remove from q4 is : "+(delq4end - delq4start)+ " ns");
		System.out.println("The time for remove from q5 is : "+(delq5end - delq5start)+ " ns");
		
		// Search Process
		
		Queue <Integer> serq1 = new LinkedList <Integer> ();
		serq1.addAll(q1);
		Queue <Integer> serq2 = new LinkedList <Integer> ();
		serq2.addAll(q2);
		Queue <Integer> serq3 = new LinkedList <Integer> ();
		serq3.addAll(q3);
		Queue <Integer> serq4 = new LinkedList <Integer> ();
		serq4.addAll(q4);
		Queue <Integer> serq5 = new LinkedList <Integer> ();
		serq5.addAll(q5);
		
		long serq1start = System.nanoTime();
		for(int i = 0;i<serq1.size();i++)
		{
			if (serq1.poll() == c1) break;
		}
		for(int i = 0;i<serq1.size();i++)
		{
			if (serq1.poll() == c2) break;
		}
		for(int i = 0;i<serq1.size();i++)
		{
			if (serq1.poll() == c3) break;
		}
		long serq1end = System.nanoTime();
		
		long serq2start = System.nanoTime();
		for(int i = 0;i<serq2.size();i++)
		{
			if (serq2.poll() == c4) break;
		}
		for(int i = 0;i<serq2.size();i++)
		{
			if (serq2.poll() == c5) break;
		}
		for(int i = 0;i<serq2.size();i++)
		{
			if (serq2.poll() == c6) break;
		}
		long serq2end = System.nanoTime();
		
		long serq3start = System.nanoTime();
		for(int i = 0;i<serq3.size();i++)
		{
			if (serq3.poll() == c7) break;
		}
		for(int i = 0;i<serq3.size();i++)
		{
			if (serq3.poll() == c8) break;
		}
		for(int i = 0;i<serq3.size();i++)
		{
			if (serq3.poll() == c9) break;
		}
		long serq3end = System.nanoTime();
		
		long serq4start = System.nanoTime();
		for(int i = 0;i<serq4.size();i++)
		{
			if (serq4.poll() == c10) break;
		}
		for(int i = 0;i<serq4.size();i++)
		{
			if (serq4.poll() == c11) break;
		}
		for(int i = 0;i<serq4.size();i++)
		{
			if (serq4.poll() == c12) break;
		}
		long serq4end = System.nanoTime();
		
		long serq5start = System.nanoTime();
		for(int i = 0;i<serq5.size();i++)
		{
			if (serq5.poll() == c13) break;
		}
		for(int i = 0;i<serq5.size();i++)
		{
			if (serq5.poll() == c14) break;
		}
		for(int i = 0;i<serq5.size();i++)
		{
			if (serq5.poll() == c15) break;
		}
		long serq5end = System.nanoTime();
		
		System.out.println("\nThe time for search within the queue 1 is : "+ (serq1end - serq1start)+" ns");
		System.out.println("The time for search within the queue 2 is : "+ (serq2end - serq2start)+" ns");
		System.out.println("The time for search within the queue 3 is : "+ (serq3end - serq3start)+" ns");
		System.out.println("The time for search within the queue 4 is : "+ (serq4end - serq4start)+" ns");
		System.out.println("The time for search within the queue 5 is : "+ (serq5end - serq5start)+" ns");
		
		
		
		
		System.out.println("\n                 ******Stack******");
		
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack3 = new Stack<Integer>();
		Stack<Integer> stack4 = new Stack<Integer>();
		Stack<Integer> stack5 = new Stack<Integer>();
		
		
		// create stack 1
		long start1 = System.currentTimeMillis();
		for(int a:Array1)
		{
			stack1.push(a);
		}
		long end1 = System.currentTimeMillis();
		
	
		
		// create stack 2
		long start2 = System.currentTimeMillis();
		for(int a:Array2)
		{
			stack2.push(a);
		}
		long end2 = System.currentTimeMillis();
	
		
		// create stack 3
		long start3 = System.currentTimeMillis();
		for(int a:Array3)
		{
			stack3.push(a);
		}
		long end3 = System.currentTimeMillis();
		
		
		// create stack 4
		long start4 = System.currentTimeMillis();
		for(int a:Array4)
		{
			stack4.push(a);
		}
		long end4 = System.currentTimeMillis();
		
		
		// create stack 5
		long start5 = System.currentTimeMillis();
		for(int a:Array5)
		{
			stack5.push(a);
		}
		long end5 = System.currentTimeMillis();
	
		
		System.out.println("\nthe creation time of stack 1 is : "+ (end1-start1));
		System.out.println("the creation time of stack 2 is : "+ (end2-start2));
		System.out.println("the creation time of stack 3 is : "+ (end3-start3));
		System.out.println("the creation time of stack 4 is : "+ (end4-start4));
		System.out.println("the creation time of stack 5 is : "+ (end5-start5));
		
		// insertion process
		
		Stack<Integer> insstack1 = new Stack<Integer>();
		insstack1.addAll(stack1);
		Stack<Integer> insstack2 = new Stack<Integer>();
		insstack2.addAll(stack2);
		Stack<Integer> insstack3 = new Stack<Integer>();
		insstack3.addAll(stack3);
		Stack<Integer> insstack4 = new Stack<Integer>();
		insstack4.addAll(stack4);
		Stack<Integer> insstack5 = new Stack<Integer>();
		insstack5.addAll(stack5);
		
		long insss1 = System.nanoTime();
		insstack1.push(z1);
		insstack1.push(z2);
		insstack1.push(z3);
		long inses1 = System.nanoTime();
		
		long insss2 = System.nanoTime();
		insstack2.push(z4);
		insstack2.push(z5);
		insstack2.push(z6);
		long inses2 = System.nanoTime();
		
		long insss3 = System.nanoTime();
		insstack3.push(z7);
		insstack3.push(z8);
		insstack3.push(z9);
		long inses3 = System.nanoTime();
		
		long insss4 = System.nanoTime();
		insstack4.push(z10);
		insstack4.push(z11);
		insstack4.push(z12);
		long inses4 = System.nanoTime();
		
		long insss5 = System.nanoTime();
		insstack5.push(z13);
		insstack5.push(z14);
		insstack5.push(z15);
		long inses5 = System.nanoTime();
		
		System.out.println("\nThe insetion time for the stack 1 is : "+(inses1 - insss1) + " ns");
		System.out.println("The insetion time for the stack 2 is : "+(inses2 - insss2) + " ns");
		System.out.println("The insetion time for the stack 3 is : "+(inses3 - insss3) + " ns");
		System.out.println("The insetion time for the stack 4 is : "+(inses4 - insss4) + " ns");
		System.out.println("The insetion time for the stack 5 is : "+(inses5 - insss5) + " ns");
		
		// the deletion process
		
		Stack<Integer> delstack1 = new Stack<Integer>();
		delstack1.addAll(stack1);
		Stack<Integer> delstack2 = new Stack<Integer>();
		delstack2.addAll(stack2);
		Stack<Integer> delstack3 = new Stack<Integer>();
		delstack3.addAll(stack3);
		Stack<Integer> delstack4 = new Stack<Integer>();
		delstack4.addAll(stack4);
		Stack<Integer> delstack5 = new Stack<Integer>();
		delstack5.addAll(stack5);
		
		long delss1 = System.nanoTime();
		delstack1.pop();
		delstack1.pop();
		delstack1.pop();
		long deles1 = System.nanoTime();
		
		long delss2 = System.nanoTime();
		delstack2.pop();
		delstack2.pop();
		delstack2.pop();
		long deles2 = System.nanoTime();
		
		long delss3 = System.nanoTime();
		delstack3.pop();
		delstack3.pop();
		delstack3.pop();
		long deles3 = System.nanoTime();
		
		long delss4 = System.nanoTime();
		delstack4.pop();
		delstack4.pop();
		delstack4.pop();
		long deles4 = System.nanoTime();
		
		long delss5 = System.nanoTime();
		delstack5.pop();
		delstack5.pop();
		delstack5.pop();
		long deles5 = System.nanoTime();
		
		System.out.println("\nThe Deletion time for stack 1 is : "+(deles1- delss1)+" ns");
		System.out.println("The Deletion time for stack 2 is : "+(deles2- delss2)+" ns");
		System.out.println("The Deletion time for stack 3 is : "+(deles3- delss3)+" ns");
		System.out.println("The Deletion time for stack 4 is : "+(deles4- delss4)+" ns");
		System.out.println("The Deletion time for stack 5 is : "+(deles5- delss5)+" ns");
		
		
		Stack<Integer> serstack1 = new Stack<Integer>();
		serstack1.addAll(stack1);
		Stack<Integer> serstack2 = new Stack<Integer>();
		serstack2.addAll(stack2);
		Stack<Integer> serstack3 = new Stack<Integer>();
		serstack3.addAll(stack3);
		Stack<Integer> serstack4 = new Stack<Integer>();
		serstack4.addAll(stack4);
		Stack<Integer> serstack5 = new Stack<Integer>();
		serstack5.addAll(stack5);
		
		int v1;
		
		long setstst1 = System.nanoTime();
		for(int i= 0; i<serstack1.size();i++)
		{
			v1 = serstack1.pop();
			if(v1 == c1) break;
		}
		for(int i= 0; i<serstack1.size();i++)
		{
			v1 = serstack1.pop();
			if(v1 == c2) break;
		}
		for(int i= 0; i<serstack1.size();i++)
		{
			v1 = serstack1.pop();
			if(v1 == c3) break;
		}
		long setendst1 = System.nanoTime();
		
		long setstst2 = System.nanoTime();
		for(int i= 0; i<serstack2.size();i++)
		{
			v1 = serstack2.pop();
			if(v1 == c4) break;
		}
		for(int i= 0; i<serstack2.size();i++)
		{
			v1 = serstack2.pop();
			if(v1 == c5) break;
		}
		for(int i= 0; i<serstack2.size();i++)
		{
			v1 = serstack2.pop();
			if(v1 == c6) break;
		}
		long setendst2 = System.nanoTime();
		
		long setstst3 = System.nanoTime();
		for(int i= 0; i<serstack3.size();i++)
		{
			v1 = serstack3.pop();
			if(v1 == c7) break;
		}
		for(int i= 0; i<serstack3.size();i++)
		{
			v1 = serstack3.pop();
			if(v1 == c8) break;
		}
		for(int i= 0; i<serstack3.size();i++)
		{
			v1 = serstack3.pop();
			if(v1 == c9) break;
		}
		long setendst3 = System.nanoTime();
		
		long setstst4 = System.nanoTime();
		for(int i= 0; i<serstack4.size();i++)
		{
			v1 = serstack4.pop();
			if(v1 == c10) break;
		}
		for(int i= 0; i<serstack4.size();i++)
		{
			v1 = serstack4.pop();
			if(v1 == c11) break;
		}
		for(int i= 0; i<serstack4.size();i++)
		{
			v1 = serstack4.pop();
			if(v1 == c12) break;
		}
		long setendst4 = System.nanoTime();
		
		long setstst5 = System.nanoTime();
		for(int i= 0; i<serstack5.size();i++)
		{
			v1 = serstack5.pop();
			if(v1 == c13) break;
		}
		for(int i= 0; i<serstack5.size();i++)
		{
			v1 = serstack5.pop();
			if(v1 == c14) break;
		}
		for(int i= 0; i<serstack5.size();i++)
		{
			v1 = serstack5.pop();
			if(v1 == c15) break;
		}
		long setendst5 = System.nanoTime();
		
		System.out.println("\nThe serching time for stack 1"+(setendst1 - setstst1)+ " ns");
		System.out.println("The serching time for stack 2"+(setendst2 - setstst2)+ " ns");
		System.out.println("The serching time for stack 3"+(setendst3 - setstst3)+ " ns");
		System.out.println("The serching time for stack 4"+(setendst4 - setstst4)+ " ns");
		System.out.println("The serching time for stack 5"+(setendst5 - setstst5)+ " ns");
		
		
	}

}
