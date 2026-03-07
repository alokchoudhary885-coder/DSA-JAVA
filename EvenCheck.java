public class EvenCheck {
    public static boolean isEven(int num){
         return num % 2 == 0;
    }
    public static void main (String args[]){
        int number = 20;

        if(isEven(number)){
         System.out.println(number+ "is a even");
        
          
        } else{
            System.out.println(number + "is a odd");
             
        }
    }
}
          
        
    
    

