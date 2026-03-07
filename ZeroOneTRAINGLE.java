public class ZeroOneTRAINGLE {
    public static void zeroOneTRAINGLE(int n){
        //outer
        for (int i=1; i<=n; i++){
            //inner
            for (int j=1; j<=i; j++){
                
                if((i+j) % 2 ==0){
                    System.out.print("1");
                 } else{
                    System.out.print("0");
                 }
                 }

                 System.out.println();
                }
            }
        
            public static void main(String[] args){
                zeroOneTRAINGLE(13);
            }

    
    
        }
