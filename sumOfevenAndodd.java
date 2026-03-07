import java.util.*;
public class sumOfevenAndodd {
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int evensum = 0;
            int oddSum = 0;

            System.out.println("Enter numbers (enter 0 to stop):");

            int n;
            while((n = sc.nextInt()) != 0) {   // 0 enter karne par loop ruk jayega
                if(n % 2 == 0) {
                    evensum += n;
                } else {
                    oddSum += n;
                }
            }

            System.out.println("Sum of even numbers: " + evensum);
            System.out.println("Sum of odd numbers: " + oddSum);
        }
    }


    }
    

