public class PrintPair {
    public static void printpair(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int current = number[i]; // 2,4,6,8,10
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + current + " , " + number[j] + ")");
                tp++;
            }
            System.out.println(" ");

        }
        System.out.print("tp is = " + tp);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        printpair(number);
    }
}
