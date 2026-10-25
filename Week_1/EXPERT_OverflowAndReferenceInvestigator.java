
package Week_1;


public class EXPERT_OverflowAndReferenceInvestigator {
    public static void main(String[] args) {

        //BYTE OVERFLOW
        
        System.out.println("=================================================");
        
        byte number = 127;
        System.out.println("Before overflowing: " + number);
        
        //Overflows the byte variable
        number++;                                                               
        
        System.out.println("After overflowing: " + number);
           
        System.out.println("=================================================");

        
        
        //STRING COMPARISON
        
        String n1 = new String("Blue");
        String n2 = new String("Blue");
        String n3 = "Blue";


        System.out.println('\n');
        System.out.println("STRING VARIABLES");




        System.out.println("n1 == n2: " + (n1 == n2));
        System.out.println("n1.equals(n2): " + n1.equals(n2));

        
        System.out.println("n1 == n3: " + (n1 == n3));
        System.out.println("n1.equals(n3): " + n1.equals(n3));


        System.out.println("n2 == n3: " + (n2 == n3));
        System.out.println("n2.equals(n3): " + n2.equals(n3));


        
        //ARRAYS COPY CHANGE VALUE
        
        int[] original = new int[5];
        int[] copy = original;


        System.out.println('\n');
        System.out.println("ARRAYS");




        System.out.println("Before changing: ");
        System.out.println("Original: " + original[0]);
        System.out.println("Copy: " + copy[0]);


        copy[0] = 67;

        
        System.out.println("After changing: ");
        System.out.println("Original: " + original[0]);
        System.out.println("Copy: " + copy[0]);


    }
}
