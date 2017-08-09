package dataAssiignment1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class LinkList{

	static int ex1 = 1000;
	static int ex2 = 10000;
	static int ex3 = 50000;
	static int ex4 = 100000;
	static int ex5 = 1000000;

	// //////to generate random values with array form //////

	public static LinkedList<Integer> generateRandom(int n) {
		Random r = new Random(n);
		LinkedList<Integer> linked = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			linked.add(r.nextInt(n));
		}
		return linked;
	}

	public static void main(String[] args) {

		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList3 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList4 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList5 = new LinkedList<Integer>();

		
		//System.out.println("Creation Process");
		// ///// calculate time for ex1
		long start1 = System.currentTimeMillis();
		linkedList1 = generateRandom(ex1);
		long end1 = System.currentTimeMillis();
		System.out.println("The Creation Time of the linkedList1 was "+ (end1 - start1)+" ms");
		
		
		
		// ///// calculate time for ex2
		long start2 = System.currentTimeMillis();
		linkedList2 = generateRandom(ex2);
		long end2 = System.currentTimeMillis();
		System.out.println("The Creation Time of the linkedList2 was "+ (end2 - start2)+" ms");
		
		// ///// calculate time for ex3
		long start3 = System.currentTimeMillis();
		linkedList3 = generateRandom(ex3);
		long end3 = System.currentTimeMillis();
		System.out.println("The Creation Time of the linkedList3 was "+ (end3 - start3)+" ms");
		
		// ///// calculate time for ex4
		long start4 = System.currentTimeMillis();
		linkedList4 = generateRandom(ex4);
		long end4 = System.currentTimeMillis();
		System.out.println("The Creation Time of the linkedList4 was "+ (end4 - start4)+" ms");

		// ///// calculate time for ex5
		long start5 = System.currentTimeMillis();
		linkedList5 = generateRandom(ex5);
		long end5 = System.currentTimeMillis();
		System.out.println("The Creation Time of the linkedList5 was "+ (end5 - start5)+" ms");
		
		//// insertion Process
		LinkedList<Integer> insLinkedList1 = linkedList1;
		LinkedList<Integer> insLinkedList2 = linkedList2;
		LinkedList<Integer> insLinkedList3 = linkedList3;
		LinkedList<Integer> insLinkedList4 = linkedList4;
		LinkedList<Integer> insLinkedList5 = linkedList5;
		
		long insstart1 = System.currentTimeMillis();
		insLinkedList1.add(500, 100);
		long insend1 = System.currentTimeMillis();
		
		long insstart2 = System.currentTimeMillis();
		insLinkedList2.add(5000, 100);
		long insend2 = System.currentTimeMillis();
		
		long insstart3 = System.currentTimeMillis();
		insLinkedList3.add(25000, 100);
		long insend3 = System.currentTimeMillis();
		
		long insstart4 = System.currentTimeMillis();
		insLinkedList4.add(50000,100);
		long insend4 = System.currentTimeMillis();
		
		long insstart5 = System.currentTimeMillis();
		insLinkedList5.add(500000,100);
		long insend5 = System.currentTimeMillis();
		
		System.out.println("\nThe time for insertion in the linkedList 1 is :"+ (insend1-insstart1)+" ms");
		System.out.println("The time for insertion in the linkedList 2 is :"+ (insend2-insstart2)+" ms");
		System.out.println("The time for insertion in the linkedList 3 is :"+ (insend3-insstart3)+" ms");
		System.out.println("The time for insertion in the linkedList 4 is :"+ (insend4-insstart4)+" ms");
		System.out.println("The time for insertion in the linkedList 5 is :"+ (insend5-insstart5)+" ms");
		
		// Deletion Process
		
		LinkedList<Integer> delLinkedList1 = linkedList1;
		LinkedList<Integer> delLinkedList2 = linkedList2;
		LinkedList<Integer> delLinkedList3 = linkedList3;
		LinkedList<Integer> delLinkedList4 = linkedList4;
		LinkedList<Integer> delLinkedList5 = linkedList5;
		
		long delstart1 = System.currentTimeMillis();
		delLinkedList1.remove(500);
		long delend1 = System.currentTimeMillis();
		
		long delstart2 = System.currentTimeMillis();
		delLinkedList2.remove(5000);
		long delend2 = System.currentTimeMillis();
		
		long delstart3 = System.currentTimeMillis();
		delLinkedList3.remove(12500);
		long delend3 = System.currentTimeMillis();
		
		long delstart4 = System.currentTimeMillis();
		delLinkedList4.remove(50000);
		long delend4 = System.currentTimeMillis();
		
		long delstart5 = System.currentTimeMillis();
		delLinkedList5.remove(500000);
		long delend5 = System.currentTimeMillis();
		
		System.out.println("\nThe time for del from LinkedList 1 is "+(delend1-delstart1)+" ms");
		System.out.println("The time for del from LinkedList 2 is "+(delend2-delstart2)+" ms");
		System.out.println("The time for del from LinkedList 3 is "+(delend3-delstart3)+" ms");
		System.out.println("The time for del from LinkedList 4 is "+(delend4-delstart4)+" ms");
		System.out.println("The time for del from LinkedList 5 is "+(delend5-delstart5)+" ms");
		
		// search process
		
		LinkedList<Integer> serLinkedList1 = linkedList1;
		LinkedList<Integer> serLinkedList2 = linkedList2;
		LinkedList<Integer> serLinkedList3 = linkedList3;
		LinkedList<Integer> serLinkedList4 = linkedList4;
		LinkedList<Integer> serLinkedList5 = linkedList5;
		
		int no1 = serLinkedList1.get(750);
		long serstarttime1 = System.currentTimeMillis();
		serLinkedList1.contains(no1);
		long serendtime1= System.currentTimeMillis();
		
		int no2 = serLinkedList2.get(7500);
		long serstarttime2 = System.currentTimeMillis();
		serLinkedList1.contains(no2);
		long serendtime2= System.currentTimeMillis();
		
		int no3 = serLinkedList3.get(37500);
		long serstarttime3 = System.currentTimeMillis();
		serLinkedList1.contains(no3);
		long serendtime3= System.currentTimeMillis();
		
		int no4 = serLinkedList4.get(75000);
		long serstarttime4 = System.currentTimeMillis();
		serLinkedList1.contains(no4);
		long serendtime4= System.currentTimeMillis();
		
		int no5 = serLinkedList5.get(750000);
		int index = serLinkedList5.indexOf(no5);
		long serstarttime5 = System.currentTimeMillis();
		serLinkedList1.contains(no5);
		long serendtime5= System.currentTimeMillis();
		
		System.out.println("\nThe time for search within linkedlist 1 is : "+(serendtime1-serstarttime1)+" ms");
		System.out.println("The time for search within linkedlist 2 is : "+(serendtime2-serstarttime2)+" ms");
		System.out.println("The time for search within linkedlist 3 is : "+(serendtime3-serstarttime3)+" ms");
		System.out.println("The time for search within linkedlist 4 is : "+(serendtime4-serstarttime4)+" ms");
		System.out.println("The time for search within linkedlist 5 is : "+(serendtime5-serstarttime5)+" ms");
		
		
	}


}
