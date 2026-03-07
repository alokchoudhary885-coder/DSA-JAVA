import java.util.*;
public class Factorial {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter a Factorial number : ");
        
            int n = sc.nextInt();

            long fact = 1;   // long use kiya because factorial bada ho sakta hai

            if(n < 0) {
                System.out.println("Factorial does not exist for negative numbers.");
            } else {
                for(int i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + n + " is: " + fact);
            }
        }
    }
}

    

