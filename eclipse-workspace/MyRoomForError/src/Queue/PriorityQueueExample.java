package Queue;

import java.util.*;

public class PriorityQueueExample {

  public static void main(String[] args) {
    
    // THIS IS HOW WE CAN CREATE COMPARATOR of Integer in reversed order 
    Comparator<Integer> revAgeCom = Comparator.reverseOrder(); 
        
    // priorityQueue maintian internal natural order for data type 
    // we can also provide our custom comparator
    
    Queue<Integer> pQue = new PriorityQueue<>(revAgeCom ) ; 
    pQue.offer(10); 
    pQue.offer(50); 
    pQue.offer(30); 
    pQue.offer(40); 
    pQue.offer(5);
    
    System.out.println( pQue  );
    
    while(! pQue.isEmpty()) {
      
      System.out.println( pQue.poll());
      
    }
    
    

  }

}