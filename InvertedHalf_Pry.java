public class InvertedHalf_Pry {
    public static void inverted_half_pyr(int n){
        //outer
        for (int i=1 ; i<=n; i++){
            //inner
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");

            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        inverted_half_pyr(5);
    }
    
}
