package newpackage;
import java.util.*;
public class ForLoopControl {
	public static void main(String[] args) {
		
//		
//		for (int i = 1; i<=10; i++) {
//			
//			if(i==5) {
//				break;
//			}
//			System.out.println("Got Sut?");
//			
//		}
		
//		for (int i = 1; i<=10; i++) {
//			
//			if(i==5) {
//				continue;
//			}
//			System.out.println("Got Sut?"+i);
//		break;
//		
//	}
		
		int count=0;
		int sum = 0;
        for (int i=1;i<=50;i++) {
            if (i%2==0)
                System.out.println(i);
//        if (i%4==0)
//            ++count;
        }
        System.out.println("the number of divisible 4: "+count);
        sum=sum+count;
        
        System.out.println(count);
}
}