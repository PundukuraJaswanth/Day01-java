public class FibonacciVerify {
    public static void main(String[] args){
        int n =20 ;
        int f1,f2,f3 ;

        f1 =1 ; f2 =1 ;
        int c= 0;
        System.out.println(f1);
        System.out.println(f2);
        for (c =2 ; c<n ; c++) {
            f3 = f1 +f2 ;
            f1 = f2 ;
            f2 = f3 ;
            System.out.println(f3);
        }
    }
}
