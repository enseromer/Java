package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapView {

	public static void main(String[] args) {

		// Set<Map.Entry<K, V>> entrySet();

		Map<String, Double> priceMap = new HashMap<>();
		System.out.println("priceMap size : " + priceMap.size());

		// V put(K key, V value);
		priceMap.put("Cucumber", 4.12);
		priceMap.put("Potato", 3.02);
		priceMap.put("Celery", 1.2);
		priceMap.put("Corn", 0.99);
		priceMap.put("Tomato", 3.99);

		System.out.println(priceMap);

		// Set<K> keySet(); // keySet view
		Set<String> allProducts = priceMap.keySet();
		System.out.println(allProducts);

		allProducts.remove("Celery");
		System.out.println(priceMap);

//    for (String key : allProducts) {
//      
//      System.out.println(key + " value is : "  + priceMap.get(key));
//      
//    }
		// Collection<V> values();

		Collection<Double> allMyPice = priceMap.values();
		System.out.println(allMyPice);

		allMyPice.remove(4.12);
		System.out.println(priceMap);

	}

}
