package newpackage;





public class LoopRec {
	public static void main(String[] args) {
		
	//how many a's in this string
	
	String str="jaaaava";
	
	//sweep str. char by char
	//if a reported, inc counter by 1
	int count = 0; 
	int x = 0;
	char c = ' ';  
	

	
	do {
		 c=str.charAt(x);
		 if (c=='a') {
			 System.out.println("A at" +x);
			 count++; //count=count+1
		 }
		 
		 //System.out.println(str.charAt(x) + " ");
		 x++;
		
	}while (x<str.length());
	System.out.println(count);
}
}
