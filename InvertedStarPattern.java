public class InvertedStarPattern {
    public static void main(String[] args){
        int n =25;
        for (int i = 1; i<=25; i++){
            for (int star =1; star<=n-i+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
