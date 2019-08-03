package method;

public class calcmethcont {

	public static void calculate(char operator, int fnum, int lnum) {

		switch (operator) {
		case '+':
			System.out.println(fnum + lnum);
			break;
		case '-':
			System.out.println(fnum - lnum);
			break;
		case '*':
			System.out.println(fnum * lnum);
			break;
		case '/':
			System.out.println(fnum / lnum);
			break;
		case '%':
			System.out.println(fnum % lnum);
			break;

		default:
			System.out.println("Invalid operation");
			break;
		}
		/*
		 * OPTIONAL : calculate method that take 3 paramEters and do below
		 * 
		 * calculate("+" , 100, 30) -- print 130 calculate("-" , 100, 30) -- print 70
		 * calculate("*" , 100, 30) -- print 3000 calculate("/" , 100, 30) -- print 3
		 * calculate("%" , 100, 30) -- print 10 calculate("abc" , 100, 30) -- print
		 * INVALID OPERATION CODE
		 * 
		 */

	}

	public static void main(String[] args) {

		calculate('+', 100, 30);
		System.out.println();
		calculate('-', 100, 30);
		System.out.println();
		calculate('*', 100, 30);
		System.out.println();
		calculate('/', 100, 30);
		System.out.println();
		calculate('%', 100, 30);
		System.out.println();
		calculate('A', 100, 30);

	}

}
