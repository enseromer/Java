package Custom;

public class MathOperations {

//  create a class MathOperations
//  add 4 private instance fields
//  doubles: num1, num2, result
//  char: operator
  private double num1;
  private double num2;
  private double result;
  private char operator;

  // create one constructor that will define 3 values: num1, num2, operator.
  // MathOperations(num1, num2, operator)
  public MathOperations(double num1, double num2, char operator) {
    this.num1 = num1;
    this.num2 = num2;
    this.operator = operator;
  }

  // one more constructor with no arguments
  // because if I will want to create an object with no params
  // I need constructor with no arguments.
  public MathOperations() {

  }

  // create getters and setters for all values
  public double getNum1() {
    return num1;
  }

  public void setNum1(double num1) {
    this.num1 = num1;
  }

  public double getNum2() {
    return num2;
  }

  public void setNum2(double num2) {
    this.num2 = num2;
  }

  public double getResult() {
    return result;
  }

  public char getOperator() {
    return operator;
  }

  public void setOperator(char operator) {
    this.operator = operator;
  }

  // override toString() method

  @Override
  public String toString() {
    return "MathOperations [num1=" + num1 + ", num2=" + num2 + ", result=" + result + ", operator=" + operator
        + "]";
  }

  // create a void method calculate()
  public void calculate() {
    switch (this.operator) {
    case '+':
      this.result = this.num1 + this.num2;
      break;
    case '-':
      this.result = this.num1 - this.num2;
      break;
    case '*':
      this.result = this.num1 * this.num2;
      break;
    case '/':
      this.result = this.num1 / this.num2;
      break;
    case '%':
      this.result = this.num1 % this.num2;
      break;
    default:
      System.out.println("Wrong command!");
    }
  }

  // this method will calculate a result

}

