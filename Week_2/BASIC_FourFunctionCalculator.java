
package Week_2;


public class BASIC_FourFunctionCalculator {
    public static void main(String[] args) {
        
        int num1 = 15;
        int num2 = -4;

        // Print the result of each operation on its own labeled line
        System.out.println("Addition (+): " + (num1 + num2));
        System.out.println("Subtraction (-): " + (num1 - num2));
        System.out.println("Multiplication (*): " + (num1 * num2));
        System.out.println("Division (/): " + (num1 / num2));
        System.out.println("Remainder (%): " + (num1 % num2));

        /*
          Note on negative operands: 
          The Modulus operator (%) behave differently. Tt keeps the sign of the left operand 
          (15 % -4 = 3, but -15 % 4 = -3).
        */
         

    }
}
