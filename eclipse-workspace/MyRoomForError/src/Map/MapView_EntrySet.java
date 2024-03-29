package Map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapView_EntrySet {

  public static void main(String[] args) {


    Map<String, Double> priceMap = new HashMap<>();
  
    priceMap.put("Cucumber", 4.12);
    priceMap.put("Potato", 3.02);
    priceMap.put("Celery", 1.2);
    priceMap.put("Corn", 0.99);
    priceMap.put("Tomato", 3.99);

    System.out.println(priceMap);

    
    //Set<Map.Entry<K, V>> entrySet();
    // Map is not an Iterable so we can not iterate over them 
    // However we can het entrySet view out of the map 
    // and it will store the keyValue pair as single Entry 
    // and store it into the Set 
    
    Set<   Entry<String, Double>    > myEntry = priceMap.entrySet(); 
    
    for (Entry<String, Double> entry : myEntry) {
      
      System.out.println("entry  : " + entry);
      System.out.println("entry.getKey() : " +  entry.getKey()  );
      System.out.println("entry.getValue() : " +  entry.getValue()  );
      
      // update everything that more than 2$ to 0.55
      if(entry.getValue()  > 2.0 ) {
        
        entry.setValue(0.55); 
        
      }

    }
    
    System.out.println(priceMap);
    
    
    
    
    
    

  }

}