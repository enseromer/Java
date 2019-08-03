package Wrapper;

public class WrapperA {
	public static void main(String[] args) {
		
		
		    int i = 10 ; 
		    
		    // boolean , char , byte, short , int , long 
		    // float , double
		    
		    /*
		     * Wrapper class --> 
		     * specifically designed to 
		     * store primitive value as object 
		     * 
		     * */
		    Boolean b =  new Boolean(true) ; 
		    Boolean b1 = new Boolean("false"); 
		    Boolean b2 = Boolean.valueOf(true); 
		    Boolean b3 = Boolean.valueOf("true"); 
		    
		    System.out.println(  b );
		    System.out.println(  b1 );
		    System.out.println(  b2 );
		    System.out.println(  b3 );
		    
		    Integer i1 = new Integer(123); 
		    Integer i2 = new Integer("123"); 
		    Integer i3 = Integer.valueOf(123); 
		    Integer i4 = Integer.valueOf("123"); 

		    System.out.println("equal? "+  i1.equals(123) );
		    System.out.println(  i2 );
		    System.out.println(  i3 );
		    System.out.println(  i4 );
		    
		    Character c1 = new Character('c'); 
		    Character c2 = Character.valueOf('c'); 
		    System.out.println( c1  );
		    System.out.println( c2.toString()  );
		    
		    
		    Character c=new Character('c');
		    Character ca=Character.valueOf('c');
		    
		    Byte z=new Byte((byte)12);
		    Byte z1=Byte.valueOf((byte)12);
		    Byte z2=new Byte("12");
		    Byte z3=Byte.valueOf("12");
		    
		    
		    Long l=new Long(123456789);
		    Long l1=Long.valueOf(12343423324L);
		    Long l2=new Long("123123131231231");
		    Long l3=Long.valueOf("12312312332534234232");
		    
		    Short s=new Short((short)(123));
		    Short s1=new Short("123");
		    Short s2=Short.valueOf((short)(123));
		    Short s3=Short.valueOf("1232");

		    
		    Integer j=new Integer(123);
		    Integer j2=new Integer("123");
		    Integer j3=Integer.valueOf(123);
		    Integer j4=Integer.valueOf("12312");
		    
		    Double d=new Double(12312.1231);
		    Double d1=new Double("123123.1231");
		    Double d2=Double.valueOf("1231212.12");
		    Double d3=Double.valueOf(123123.1231);
		    
		    Float f=new Float(12.121231212);
		    Float f1=new Float("123123.123123");
		    Float f2=Float.valueOf("1212.1212");
		    Float f3=Float.valueOf( (float) 12112.1212);
		    
		  
		    
		    
		    
//		   System.out.println(f);
		    
		    
		    
		  
		}

	}
