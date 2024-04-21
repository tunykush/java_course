/*In the file Calculator.java, write a class called Calculator that emulates basic functions of a calculator: add, subtract, multiply, divide, and clear. The class has one private member field called value for the calculator's current value. Implement the following Constructor and instance methods as listed below:

public Calculator() - Constructor method to set the member field to 0.0
public void add(double val) - add the parameter to the member field
public void subtract(double val) - subtract the parameter from the member field
public void multiply(double val) - multiply the member field by the parameter
public void divide(double val) - divide the member field by the parameter
public void clear( ) - set the member field to 0.0
public double getValue( ) - return the member field
Given two double input values num1 and num2, the program outputs the following values:

The initial value of the instance field, value
The value after adding num1
The value after multiplying by 3
The value after subtracting num2
The value after dividing by 2
The value after calling the clear() method*/



package objectnclass;

public class calculator1 {
    public class Calculator {
        private double value;
        public Calculator() {
           value=0;
        }
        public void add(double val) {
           value += val;
        }
        public void subtract(double val) {
           value -= val;
        }
        public void multiply(double val) {
           value *= val;
        }
        public void divide(double val) {
           value /= val;
        }
        public void clear( ) {
           value = 0;
        }
        public double getValue( ) {
           return value ;
        }
        
     }
     
}
