
import java.util.Scanner;
public class patterns1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        
        for(int row = 1;row<=rows ;row++){
            for(int col = 1 ;col <= row;col++){
                System.out.println(col);
            }
          System.out.println();
        }
    }
    
}
