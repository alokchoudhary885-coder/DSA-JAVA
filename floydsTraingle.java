public class floydsTraingle {
    public static void floyds_traingle(int n) {
        int counter = 1;
        // outer
        for (int i = 1; i <= n; i++) {
            // inner how many time to print counter
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyds_traingle(4);

    }

}
