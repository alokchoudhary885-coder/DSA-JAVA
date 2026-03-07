// public class FunctionPrimeOrNot { 
    // public static boolean isPrime(int n) {
    //     boolean isPrime = true;

    //     for(int i = 2; i<=n-1; i++) {
    //         if(n % i == 0) {
    //             isPrime = false;
    //         }
    //     }

    //         return isPrime;

        
            
        
    //     }
    // public static void main(String args[]) {
    //   System.out.println(isPrime(7));  // Output: true
      
    // }
// }
    //    
public class FunctionPrimeOrNot {

    public static boolean isPrime(int n) {   // <-- Add here
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void PrimeinRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimeinRange(20);
    }
}
