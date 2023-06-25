public class ArrayVerify {
    public static void main(String[] args){
        int age[] = new int[15];
        for(int i = 0 ;i< age.length; i++) {
         age[i] = i*5;
        }
    }

    for(int i = 0; i< age.length; i++) {
    
        System.out.println(age[i]);
    }
}
