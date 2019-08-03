package Custom;

public class MathEquation {

		private double oprand1;
		private double oprand2;
		private double result;
		private char operator;

		public MathEquation() {
			
		}
		

		public MathEquation(char operator) {
			super();
			this.operator = operator;
		}


		public MathEquation(double oprand1, double oprand2, double result, char operator) {
			super();
			this.oprand1 = oprand1;
			this.oprand2 = oprand2;
			this.result = result;
			this.operator = operator;
		}
		
		public void colculate() {
			switch (operator) {
			case '+':
				result =oprand1-oprand2;
			    System.out.println(oprand1+"+"+oprand2+"="+result);
			    break;
			
		case '-':
			result =oprand1-oprand2;
			System.out.println(oprand1+"-"+oprand2+"="+result);
		    break;
		case '*':
			result =oprand1*oprand2;
			System.out.println(oprand1+"*"+oprand2+"="+result);
		    break;
		case '/':
			result =oprand1/oprand2;
			System.out.println(oprand1+"/"+oprand2+"="+result);
		    break;
		}
		}
		
			
		

		public String toString() {
			return "MathEquation [oprand1=" + oprand1 + ", oprand2=" + oprand2 + ", result=" + result + ", operator="
					+ operator + "]";
		}

		public double getOprand1() {
			return oprand1;
		}

		public void setOprand1(double oprand1) {
			this.oprand1 = oprand1;
		}

		public double getOprand2() {
			return oprand2;
		}

		public void setOprand2(double oprand2) {
			this.oprand2 = oprand2;
		}

		public double getResult() {
			return result;
		}

		public void setResult(double result) {
			this.result = result;
		}

		public char getOperator() {
			return operator;
		}

		public void setOperator(char operator) {
			this.operator = operator;
		
	}
}

