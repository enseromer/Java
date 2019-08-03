package Wrapper;

public class Wrapper {
public static void main(String[] args) {
	System.out.println(Integer.MAX_VALUE); 
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.parseInt("123"));
	System.out.println(Integer.valueOf("123"));
	
	
	System.out.println(Byte.MAX_VALUE); 
	System.out.println(Byte.MIN_VALUE); 
	System.out.println(Integer.parseInt("123"));
	System.out.println(Integer.valueOf("123"));
	
	
	System.out.println(  Character.isWhitespace('\n')    );
	System.out.println(  Character.isDigit('9')   );
	System.out.println(  Character.isUpperCase('w')   );
	System.out.println(  Character.isLowerCase('C')   );
	System.out.println(  Character.isAlphabetic('z')   );
	System.out.println(  Character.getNumericValue('1')   );
	
	System.out.println(Float.MAX_VALUE);
	System.out.println(Float.MIN_VALUE);
	System.out.println(Float.parseFloat("123.12"));
	System.out.println(Float.valueOf("123.123"));
	
	System.out.println(Double.MAX_VALUE);
	System.out.println(Double.MIN_VALUE);
	System.out.println(Double.parseDouble("123.12"));
	System.out.println(Double.valueOf("123.123"));
	System.out.println(Double.isInfinite(10/0.0) );
}
}
