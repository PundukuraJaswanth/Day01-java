import java.util.*;
public class fibonacciScanner {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int k,a=1,b=1;
    k=0;
    System.out.print("1 1 ");
    int N = sc.nextInt();
    while(k<=N){
        System.out.print(k + " ");
        k = a + b;
        a=b;
        b=k;
    }
    System.out.println();
    }
}
