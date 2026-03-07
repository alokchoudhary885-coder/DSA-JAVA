public class SolidRhombus {
    public static void soliDrhombus(int n){
        //outer
        for (int i=1; i<=n; i++){
            //spaces n-i
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=n; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        soliDrhombus(5);
    }
    
}
