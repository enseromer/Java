package Custom;

public class MathOperationsTest {

	 public static void main(String[] args) {
		    MathOperations operation1 = new MathOperations(5, 15, '+');
		    System.out.println(operation1);
		    System.out.println("Result: " + operation1.getResult());
		    MathOperations operation2 = new MathOperations();
		    operation2.setNum1(8);
		    operation2.setNum2(20);
		    operation2.setOperator('*');
		    operation2.calculate();
		    System.out.println(operation2);
		    // HOMEWORK
		    // CREATAE A LIST OF OPERATIONS
		    // USE SCANNER TO SET VALUES

		  }
		}