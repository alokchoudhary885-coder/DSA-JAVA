import java.util.*;
public class NaturalNumber {
    public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int sum = 0;
        

            int i =1;
            while (i<=n){
                sum += i;
                i++;
            }
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        }
    }
}
