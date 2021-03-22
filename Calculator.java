public class Calculator {
  
  public Calculator() {

  }

  public int add(int a, int b) {
    int sum = a + b;
    System.out.println(a + " plus " + b + " is equal to " + sum + ".");
    return sum;
  }

  public int subtract(int a, int b) {
    int difference = a - b;
    System.out.println(a + " minus " + b + " is equal to " + difference + ".");
    return difference;

  }

  public int multiply(int a,int b) {
    int product = a * b;
    System.out.println(a + " multiplied by " + b + " is equal to " + product + ".");
    return product;

  }

  public int divide(int a, int b) {
    int quotient = a / b;
    System.out.println(a + " divided by " + b + " is equal to " + quotient + ".");
    return quotient;

  }

  public int modulo(int a, int b){
    int remainder = a % b;
    System.out.println("The remainder of " + a + " divided by " + b + " is equal to " + remainder + ".");
    return remainder;
  }

  public static void main(String [] args){

      Calculator myCalculator = new Calculator();

      myCalculator.add(5, 7);
      myCalculator.subtract(17, 4);
      

  }

}