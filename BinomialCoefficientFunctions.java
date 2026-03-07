public class BinomialCoefficientFunctions {

    // factorial function define karna zaroori hai
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int BinoCoe(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binom_coeff = fact_n / (fact_r * fact_nmr);
        return binom_coeff;
    }

    public static void main(String args[]){
        System.out.println(BinoCoe(5, 2));  // Output: 10
    }
}
