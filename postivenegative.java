import java.util.*;

public class postivenegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int temperature = sc.nextInt();

        if (temperature >=0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
        sc.close();
    }
    
}
