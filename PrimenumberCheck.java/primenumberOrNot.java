public class primenumberOrNot {
    public static void main(String[] args){
       int n =170 ;
       boolean flag = true ;
       for (int i = 2; i<= Math.sqrt(n); i++) {
        if (n%i == 0){
            System.out.println(n + "not a prime");
            flag = false;
            break;
        }
       }
       if(flag == true)
        System.out.println(n + "it is a prime");
       


    }

}
