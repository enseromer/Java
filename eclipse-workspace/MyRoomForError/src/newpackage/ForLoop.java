package newpackage;
import java.util.*;

public class ForLoop {
public static void main(String[] args) {
	

    
    //Scanner scan=new Scanner(System.in);
    
//    int num1, num2, sum;
//	int x = 0;
//	
//	do {
//		System.out.println("Enter 2 numbers");
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		sum = num1+num2;
//		++x;
//	}while(sum<=100 ||	 x<=3);
//	System.out.println("ZE END");
    //int i =20;
	
//	for (int i= 20; i<=80; i++) {
//		 i = i/2;
		//System.out.println(i+" ");
		
		
	//}
	//System.out.println();
//	
//	int j;
//	for (j=1; j<=10;j++) {
//		System.out.println(j+" ");
//		
//	}
	
	//   initial   compare   inc/dec
	
//	for (int i = 1; i<=10; i+=3) {
//		System.out.println(i+" ");
//	}
    int i = 1;
	int j = 1;
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
    
    String piece = "*";
    for ( i = 1; i<=n; i++) {
    	for (j=i;j<=i;i++)
		System.out.print(piece);
    }
    System.out.println("");
}
}
