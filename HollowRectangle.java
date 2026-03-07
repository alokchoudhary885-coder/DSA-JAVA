public class HollowRectangle {
    public static void Hollow_rectangle (int totalRows , int totalColoumns){
        //outer loop for rows
        for (int i=1; i<=totalRows; i++){
            //inner coloumns
            for (int j=1; j<=totalColoumns; j++){
                // cell (i, j) is boundary cell
                if(i==1 || i == totalRows || j==1 || j== totalColoumns){
                    // boundary cell
                    System.out.print("*");

                } else {
                System.out.print(" ");
            }
        }
            // after each row, print a new line
            System.out.println();

                }
            }
            public static void main (String[] args){
                Hollow_rectangle (7,5);
        }
    
    
}
