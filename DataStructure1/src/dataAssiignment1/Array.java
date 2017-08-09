package dataAssiignment1;
import java.util.Random;



public class Array {
	
	static int ex1 = 1000;
	static int ex2 = 10000;
	static int ex3 = 50000;
	static int ex4 = 100000;
	static int ex5 = 1000000;
	
	
	///////// generate random values ////////
	public static int generateRandomNomber(int n){
		Random a = new Random();
		int ran = a.nextInt(n);
		return ran;
		
	}
	
	//////// to generate random values with array form //////
	public static int[] generateRandomArray(int n) {
	    Random r = new Random();
	    int[] randomArray = new int[n];
	    for (int i = 0; i < n; i++) {
	        randomArray[i] = r.nextInt(n);
	    }
	    return randomArray;
	}
	
	/////// insertion //////////
	
	public static int[] insertion (int array [],int val, int position)
	{
		
		int counter1 = array.length - 1;
		int maxArray [] = new int[array.length +1];
		int counter2 = position-1;
		for(int i=array.length - 1; i>= position;i--)
		{
			maxArray[i+1] = array[i];
		}
		maxArray[position] = val;
		
		if(position != 0)
		{
			for(int i=position-1;i>=0;i--)
			{
				maxArray[position-1]= array[position-1];
				position--;
			}
		}
		
		return maxArray;
		
	}

	public static void main(String[] args) {		
		
		///////////////start of creation//////////////
		
		System.out.println("Creation Process");
		
		long startCreation1 = System.currentTimeMillis();
		int val1 [] = new int[ex1];
		val1 = generateRandomArray(ex1);
		long endCreation1 = System.currentTimeMillis();
		System.out.println("creation1 time was "+ (endCreation1 - startCreation1) +" ms " );
		

		long startCreation2 = System.currentTimeMillis();
		int val2 [] = new int[ex2];
		val2 = generateRandomArray(ex2);
		long endCreation2 = System.currentTimeMillis();
		System.out.println("creation2 time was "+ (endCreation2 - startCreation2) +" ms " );
		
		long startCreation3 = System.currentTimeMillis();
		int val3 [] = new int[ex3];
		val3 = generateRandomArray(ex3);
		long endCreation3 = System.currentTimeMillis();
		System.out.println("creation3 time was "+ (endCreation3 - startCreation3) +" ms " );
		
		long startCreation4 = System.currentTimeMillis();
		int val4 [] = new int[ex4];
		val4 = generateRandomArray(ex4);
		long endCreation4 = System.currentTimeMillis();
		System.out.println("creation4 time was "+ (endCreation4 - startCreation4) +" ms " );
		
		long startCreation5 = System.currentTimeMillis();
		int val5 [] = new int[ex5];
		val5 = generateRandomArray(ex5);
		long endCreation5 = System.currentTimeMillis();
		System.out.println("creation5 time was "+ (endCreation5 - startCreation5) +" ms " );
		
		
		/////////////// end of creation ///////////////

		////////////// start of insertion /////////////
		
		
		//Array 1
		
		int randomArray1 [] = new int[ex1];
		randomArray1 = generateRandomArray(ex1);
		
		long startinsertion1 = System.currentTimeMillis();
		int newArray1[] = insertion(randomArray1, 1000, 500);
		long endinsertion1 = System.currentTimeMillis();
		
		// array 2
		
		int randomArray2 [] = new int[ex2];
		randomArray2 = generateRandomArray(ex2);

		long startinsertion2 = System.currentTimeMillis();
		int newArray2[] = insertion(randomArray2, 1000, 5000);
		long endinsertion2 = System.currentTimeMillis();
		
		// Array 3
		
		int randomArray3 [] = new int[ex3];
		randomArray3 = generateRandomArray(ex3);

		long startinsertion3 = System.currentTimeMillis();
		int newArray3[] = insertion(randomArray3, 1000, 25000);
		long endinsertion3 = System.currentTimeMillis();
		
		// Array 4
		
		int randomArray4 [] = new int[ex4];
		randomArray4 = generateRandomArray(ex4);

		long startinsertion4 = System.currentTimeMillis();
		int newArray4[] = insertion(randomArray4, 1000, 50000);
		long endinsertion4 = System.currentTimeMillis();
		
		// Array 5
		
		int randomArray5 [] = new int[ex5];
		randomArray5 = generateRandomArray(ex5);

		
		long startinsertion5 = System.currentTimeMillis();
		int newArray5[] = insertion(randomArray5, 4, 500000);
		long endinsertion5 = System.currentTimeMillis();
		
		System.out.println("\nInsertion process");
		System.out.println("The insertion time was "+ (endinsertion1-startinsertion1+" ms"));
		System.out.println("The insertion time was "+ (endinsertion2-startinsertion2+" ms"));
		System.out.println("The insertion time was "+ (endinsertion3-startinsertion3+" ms"));
		System.out.println("The insertion time was "+ (endinsertion4-startinsertion4+" ms"));
		System.out.println("The insertion time was "+ (endinsertion5-startinsertion5+" ms"));
		
		// Search process
		
		int scharray1 [] = new int[ex1];
		int scharray2 [] = new int[ex2];
		int scharray3 [] = new int[ex3];
		int scharray4 [] = new int[ex4];
		int scharray5 [] = new int[ex5];
		
		scharray1 = generateRandomArray(ex1);
		scharray2 = generateRandomArray(ex2);
		scharray3 = generateRandomArray(ex3);
		scharray4 = generateRandomArray(ex4);
		scharray5 = generateRandomArray(ex5);
		
		// Array 1
		//int searchRan1 = generateRandomNomber(ex1);
		int test1 = scharray1[750];
		long startsearch1 = System.currentTimeMillis();
		for(int i=0; i<scharray1.length;i++)
		{
			if(scharray1[i] == test1);
		}
		long endsearch1 = System.currentTimeMillis();
		
		// Array 2
		//int searchRan2 = generateRandomNomber(ex2);
		int test2 = scharray2[7500];
		long startsearch2 = System.currentTimeMillis();
		for(int i=0; i<scharray2.length;i++)
		{
			if(scharray2[i] == test2);
		}
		long endsearch2 = System.currentTimeMillis();
		
		// Array 3
		//int searchRan3 = generateRandomNomber(ex3);
		int test3 = scharray3[37500];
		long startsearch3 = System.currentTimeMillis();
		for(int i=0; i<scharray3.length;i++)
		{
			if(scharray3[i] == test3);
		}
		long endsearch3 = System.currentTimeMillis();
		
		// Array4
		int test4 = scharray4[75000];
		long startsearch4 = System.currentTimeMillis();
		for(int i=0; i<scharray4.length;i++)
		{
			if(scharray4[i] == test4);
		}
		long endsearch4 = System.currentTimeMillis();
		
		// Array 5
		int test5 = scharray5[750000];
		long startsearch5 = System.currentTimeMillis();
		for(int i=0; i<scharray5.length;i++)
		{
			if(scharray5[i] == test5);
		}
		long endsearch5 = System.currentTimeMillis();
		
		System.out.println("\nSearching process");
		System.out.println("The Searching time was "+ (endsearch1-startsearch1+" ms"));
		System.out.println("The Searching time was "+ (endsearch2-startsearch2+" ms"));
		System.out.println("The Searching time was "+ (endsearch3-startsearch3+" ms"));
		System.out.println("The Searching time was "+ (endsearch4-startsearch4+" ms"));
		System.out.println("The Searching time was "+ (endsearch5-startsearch5+" ms"));
		
		// Deletion Process 
		
		
		// Array 1
		int delarray1 [] = new int[ex1];
		int pa11 = 250;
		int pa12 = pa11+1;
		
		long delstart1 = System.currentTimeMillis();
		for(int i=pa11;i<delarray1.length-1;i++)
		{
			delarray1[pa11] = delarray1[pa12];
			pa11++;
			pa12++;
		}
		long delend1 = System.currentTimeMillis();
		
		// Array 2
		int delarray2 [] = new int[ex2];
		int pa21 = 2500;
		int pa22 = pa21+1;
		
		long delstart2 = System.currentTimeMillis();
		for(int i=pa21;i<delarray2.length-1;i++)
		{
			delarray2[pa21] = delarray2[pa22];
			pa21++;
			pa22++;
		}
		long delend2 = System.currentTimeMillis();
		
		// Array 3
		int delarray3 [] = new int[ex3];
		int pa31 = 12500;
		int pa32 = pa31+1;
		
		long delstart3 = System.currentTimeMillis();
		for(int i=pa31;i<delarray3.length-1;i++)
		{
			delarray3[pa31] = delarray3[pa32];
			pa31++;
			pa32++;
		}
		long delend3 = System.currentTimeMillis();
		
		// Array 4
		int delarray4 [] = new int[ex4];
		int pa41 = 50000;
		int pa42 = pa41+1;
		
		long delstart4 = System.currentTimeMillis();
		for(int i=pa41;i<delarray4.length-1;i++)
		{
			delarray4[pa41] = delarray4[pa42];
			pa41++;
			pa42++;
		}
		long delend4 = System.currentTimeMillis();
		
		// Array 5
		int delarray5 [] = new int[ex5];
		int pa51 = 500000;
		int pa52 = pa51+1;
		
		long delstart5 = System.currentTimeMillis();
		for(int i=pa51;i<delarray5.length-1;i++)
		{
			delarray5[pa51] = delarray5[pa52];
			pa51++;
			pa52++;
		}
		long delend5 = System.currentTimeMillis();
		
		System.out.println("\nDeletion process");
		System.out.println("The deletion time for array 1 is : "+(delend1 - delstart1)+" ms");
		System.out.println("The deletion time for array 2 is : "+(delend2 - delstart2)+" ms");
		System.out.println("The deletion time for array 3 is : "+(delend3 - delstart3)+" ms");
		System.out.println("The deletion time for array 4 is : "+(delend4 - delstart4)+" ms");
		System.out.println("The deletion time for array 5 is : "+(delend5 - delstart5)+" ms");
	}

}