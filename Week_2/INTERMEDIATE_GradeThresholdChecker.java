
package Week_2;

public class INTERMEDIATE_GradeThresholdChecker {
    public static void main(String[] args) {
        
        double average = 74;
        int absences = 2;


        if((average >= 75 && absences <= 3) || average >= 90){
            System.out.println("YOU PASSED. \nREASON: \nAverage: " + (average) +"\nAbsences: " + (absences));
        }else if (average < 75) {
            if (absences > 3){
                System.out.print("YOU FAILED. \nREASONS: \nAverage: " + (average) +"\nAbsences: " + (absences));
            }else System.out.print("YOU FAILED. \nREASON: \nAverage: " + (average));
        }else if (absences > 3){
            System.out.print("YOU FAILED. \nREASON: \nAbsences: " + (absences));
        }
    }
}
