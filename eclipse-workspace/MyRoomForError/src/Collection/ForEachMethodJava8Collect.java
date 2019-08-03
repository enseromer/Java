package Collection;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodJava8Collect {
	public static void main(String[] args) {

		List<Double> lst = new ArrayList<>();
		lst.add(2d);
		lst.add(5d);
		lst.add(8d);
		lst.add(13d);
		lst.add(12d);
		lst.add(111d);
		lst.add(7d);

//		for (Double each : lst) {
//			System.out.println("Item Vallue: " +each);
//		}

		lst.forEach(each -> System.out.println("Item Vallue: " + each));
		System.out.println("________________");
		System.out.println();
		lst.removeIf(each -> each < 10);
		System.out.println(lst);
		// List<WebElement> items = driver.findElements(By...);
		// items.removeIf( each -> each.getText().seeAsNumber < 100)

	}
}
