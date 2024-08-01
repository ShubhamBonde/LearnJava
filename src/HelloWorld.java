/*
    Problem: Write a Java code to print the following pattern:

        S            M
        SH          MA
        SHU        MAH
        SHUB      MAHB
        SHUBH    MAHBU
        SHUBHA  MAHBUH
        SHUBHAMMAHBUHS
*/
public class HelloWorld {
    public static void main(String[] args) {
        
        Character[] lettersInName = {'S', 'H', 'U', 'B', 'H', 'A', 'M'};
        int lettersLength = lettersInName.length;

        // First half of the pyramid
        // for (int i = 0; i < lettersInName.length; ++i) {
        //     // First half of the pyramid
        //     for (int j = 0; j <= i; ++j) {
        //         System.out.print(lettersInName[j]);
        //     }

        //     // Prints spaces in between towers.
        //     for (int j = 0; j < ((lettersLength*2) - (i+1)*2); ++j) {
        //         System.out.print(" ");
        //     }
            
        //     // Second Half of the pyramid.
        //     for (int j = lettersLength-(i+1); j < lettersLength; ++j) {
        //         System.out.print(lettersInName[j]);
        //     }
        //     System.out.println();
        // }


        // First half of the pyramid
        for (int i = 0; i < lettersInName.length; ++i) {
            // First half of the pyramid
            for (int j = 0; j <= i; ++j) {
                System.out.print(lettersInName[j]);
            }

            // Prints spaces in between towers.
            for (int j = 0; j < ((lettersLength*2) - (i+1)*2); ++j) {
                System.out.print(" ");
            }
            
            // Second Half of the pyramid.
            for (int j = lettersLength - 1; j >= (lettersLength - (i+1)); --j) {
                System.out.print(lettersInName[j]);
            }
            System.out.println();
        }
    }
}
