public class fibonacci{
      public static void main(String[] args){
        int k,a=1,b=1;
        int N = 100;
        k =0;
        System.out.print("1 1 ");
        while (k <= N){
            k = a +b ;
            System.out.print(k + " ");
            a=b;
            b=k;
          
        }
       System.out.println();
    }
}