package M31819;

public class Divide {
	public static void main(String[] args) {
		
		
		
		
	}

public static int divide(int a, int b) {
		
		if(b==0) {
			System.out.println("Invalid value");
		}
		
		int quot = 0;
		
		int a1 = (Math.abs(a)+a==0)?-1:1;
		int b1 = (Math.abs(b)+b==0)?-1:1;
		
		a = Math.abs(a);
		b = Math.abs(b);
		
		while(a>=b) {
			a -= b;
			quot++;
		}
		
		return a1*b1*quot;
	}


public static int modulus(int a, int b) {
	
	if(b==0) {
		System.out.println("Invalid value");
	}
	
	int check = (a<0) ? -1:1;
	
	a = Math.abs(a);
	b = Math.abs(b);
	
	while(a>=b) {
		a -= b;
	}
	
	return a*check;
}
}
