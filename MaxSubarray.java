public class MaxSubarray {
    @SuppressWarnings("unused")
    public static void maxsubarray(int number[]){
         int curSum =0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0]=number[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for (int i=0; i<number.length; i++){
          int start=i;

         for(int j=i; j<number.length; j++){
            int end =j;
            int CurSum = prefix[end] - (start == 0 ? 0 : prefix[start-1]);
            if(CurSum>max){
                max=CurSum;
              //  current +=number[j];
                //if(current>max){
                 ///   max=current;
               // }
                //System.out.print(max+" ");
           // } 
            //System.out.println();
            }
        }

    }
    System.out.println("max sumis="+max);
}
    public static void main(String[] args){
        int number[]={1,-2,6,-1,3};
        maxsubarray(number);
    }
    
}
