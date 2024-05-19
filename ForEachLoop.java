package practice;

public class ForEachLoop {
		public static void main(String args[])
		{
			//Three types of initializaton of array in java
			int data[]= {12,33,44};
			int []pp= {56,34,67};
			int x[]=new int[] {22,56,78,44,90,65};
			
			for(int a:x)
				System.out.print(a+" ");
			System.out.println();
			for(Integer a:x)
				System.out.print(a+" ");
			System.out.println();
			for(Object a:x)
				System.out.print(a+" ");
		}
	}

