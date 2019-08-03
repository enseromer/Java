package mypackage;
import java.util.*;
public class Pool {
public static void main(String[] args) {
	
	
	
	
	long x=10;
	long y=10;
	
	System.out.println(x==y);
	
	//s is variable & container to hold
	//address of any 1x scan obj.
	//reference  "  "   "    "
	//pointer to "  "   "   "
	
	
	Scanner s=new Scanner(System.in);
	Scanner s2=new Scanner(System.in);
	
	System.out.println(s==s2); //== check location/ref
	
	//.equals check value, content
	
	String s1="literal";
	String sa=new String ("literal");
	String sb="literal"; 
	String sc="cat";
	
	//since literal exists already in pool
	//it will not create new obj, will just point to 
	//existing obj
	
	
	System.out.println(s1.equals(sa));
	System.out.println(s1==sa);
	
	
	
	
}
}
