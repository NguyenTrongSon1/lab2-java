package bai2;

public class vd9 {
    public static void main(String[] args) {
        int row, col;
        for(row = 1 ; row <= 5 ; row ++){
            for(col = 1; col < row ; col ++){
                System.out.print("*");
            }//End of inner for loop

            System.out.println();
        }//End of outer for loop
    }
}
