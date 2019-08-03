package mypackage;

public class TablecellLocate {
	public static void main(String[] args) {
		//create program to print each location of 
		//cell in format:
		//cell (1,1) cell (1,2)
		//cell (2,1) cell (2,2)
		
		
		//given
		//3 rows & 4 column
		
		for (int row =1; row <= 3 ; row++) {
//			System.out.println("Row: "+ i);
			
			for (int col =1; col <= 4 ; col++) {
				System.out.print("Cell ( "+ row + "," + col + ")");
				
			}
			System.out.println();
		}
//		
//		System.out.print("Cell(" + 1 + "," + 1 + ")"   );
//		System.out.print("Cell(" + 1 + "," + 2 + ")"   );
//		System.out.print("Cell(" + 1 + "," + 3 + ")"   );
//		System.out.print("Cell(" + 1 + "," + 4 + ")"   );
//		
//		
	}

}
