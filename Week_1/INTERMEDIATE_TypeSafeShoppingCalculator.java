
package Week_1;

public class INTERMEDIATE_TypeSafeShoppingCalculator {
    public static void main(String[] args) {
        
        int quantity = 4;
        double unitPrice = 2.25, totalCost = quantity * unitPrice; 
        String storeName = "FRUIT SHOP";
        
         /* totalCost should be a double because unitPrice is a double.
            The result of multiplying an int by a double is a double.
            Using int for totalCost would cause a compile-time error 
            and data could be lost because Java does not automatically 
            convert a double to an int. */
         
        System.out.println("======================="+storeName+"=======================\n");
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total: " + totalCost);
        System.out.println("\n===========================================================");
    }
}
