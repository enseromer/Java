package StringBuild;

public class Builder {

public static void main(String[] args) {
	
	/*
	 		String: sequences of characters, immutable. 
	 		StringBuilder: sequences of characters, mutable
	 		
	 		StringBuilder' methods: Append, Reverse, Insert
	 					replace, delete, deletecharAt.
	 			
	 			
	 		StringBuilder vs StringBuffer
	 		
	 */
	
	
	
	String str ="Cybertek";
			str.concat(" School");  // "Cybertek School"
		System.out.println(str);
		// more than 90% methods in string are return methods
		
	String str2 = new String("Cybertek");
	
	String str3="Cybertek";
			str3 = "Cybertek"+" School";  // "Cybertek School
			
			String str4 ="Cybertek School";
		
			System.out.println(str3 == str4);
	
	
	// declaration of StringBuilder		
	StringBuilder strb =new StringBuilder("Cybertek");
	
	
		// Append()
	
			strb.append(" School");
			// methods in string builder are void methods
			System.out.println(strb);
	
	
	// reverse();
			StringBuilder strb1 = new StringBuilder("Batch11");
					strb1.reverse();
			
		System.out.println(strb1);
		
	// toString( ):  converts String builder to String.
			String str7 =	strb1.toString();
	
			
			String Reverse1 =  Rev( "Cybertek School Batch11" );
			System.out.println(Reverse1);
			
	
		// Append(str, Starting index, ending index):    ending index is excluded
			StringBuilder sb1 = new StringBuilder("Batch11");
				 sb1.append(" School is great ", 0, 6+1 );
				 System.out.println(sb1);
				 
				 
					StringBuilder sb = new StringBuilder("Virginia");
					String example1 =" Virginia is a great state";
					// sb : Virginia is a great state
					
					sb.append( example1  ,  example1.indexOf(" is") , example1.length());
					System.out.println(sb);
						

	// insert(index num, str):		
					StringBuilder sb2 = new StringBuilder("cybertek is a school");	
					System.out.println(sb2);
					// sb2: Cybertek is a Great school
						sb2.insert(13, " Great");
						System.out.println(sb2);
						
	
						StringBuilder sb3 = new StringBuilder("A");
						
					//	sb3 =	sb3.append("B").append("C").toString().toLowerCase();
									// to String method converts String builder to String and returns STring value
						String strs= sb3.append("B").append("C").toString().toLowerCase();
									
									System.out.println( sb3 );
									System.out.println(strs);
									
						String strs2 ="abc";
						String strs3= new String("abc");
						System.out.println(strs == strs2);
						
						System.out.println(strs == strs3);
						System.out.println(strs.equals(strs2));

						
			// Delete(beginning index, ending index )  ending index is excluded
					StringBuilder  strbuilder = new StringBuilder("Cybertek iS a School");
							strbuilder.delete( strbuilder.lastIndexOf("S"), strbuilder.length() );
							System.out.println(strbuilder);
			
			// replace(beginning index, ending index, str);
					StringBuilder  strbuilder2 = new StringBuilder("Cybertek iS a School");
					strbuilder2.replace( strbuilder2.lastIndexOf("S"),strbuilder2.length() , " Family ");
					System.out.println(strbuilder2);
			
	StringBuilder strbuilder3 =new StringBuilder("Java is fun");
		// expected condition: game is fun
			strbuilder3.replace(0, strbuilder3.indexOf(" ") , "Game");
			System.out.println(strbuilder3);
			
	
			// DeleteCharAt(index num)
			StringBuilder strbuilder4 = new StringBuilder("Java is fun");
					strbuilder4.deleteCharAt( strbuilder4.indexOf("is") );
					System.out.println(strbuilder4);
					
		StringBuilder strbuilder5 =new StringBuilder("Java is fun, Book is good, life is great");
					strbuilder5.delete(strbuilder5.indexOf("k")+2,  strbuilder5.indexOf("k")+4);
					System.out.println(strbuilder5);
					
	
}


public static String Rev(String str) {
	return new StringBuilder(str).reverse().toString();
}


}