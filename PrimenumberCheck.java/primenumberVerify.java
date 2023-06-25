public class primenumberVerify {
    public static void main (String[] args){
        int num = 100, count;
        for(int i = 100 ; i<=1000 ; i++){
            count = 0 ;
            for( int j = 100 ; j<=i ; j++){
               if (i % j == 0){
                count++;
                break;
               }
            }
           if(count==0){
            System.out.println("The number is a prime");
           } 
                 
        }
    }
    
}
