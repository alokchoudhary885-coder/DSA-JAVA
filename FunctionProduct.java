public class FunctionProduct {
    public static int product(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int a=6;
        int b=8;
        int product =product (a,b);
        System.out.println("a * b = " + product);
        product = product(20,30);
        System.out.println("20 * 30 = " + product);
    }
}
