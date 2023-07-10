import java.util.*;

public class Linkedlistevenodd {
    public static void main(String[] args){
        LinkedList<Integer> myIntegers = new LinkedList<>();

        
        myIntegers.add(0,1);
        myIntegers.add( 1,2);
        myIntegers.add(2,3);
        myIntegers.add(3,4);
        myIntegers.add(4,5);
        myIntegers.add(5,6);
        myIntegers.add(6,7);
        myIntegers.add(7,8);
        myIntegers.add(8,9);
        myIntegers.add(9, 10);

        Iterator iterator = myIntegers.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        
        System.out.println("The Team A is");
        System.out.println(myIntegers.get(0));
        System.out.println(myIntegers.get(2));
        System.out.println(myIntegers.get(4));
        System.out.println(myIntegers.get(6));
        System.out.println(myIntegers.get(8));

        System.out.println("The Team B is");
        System.out.println(myIntegers.get(1));
        System.out.println(myIntegers.get(3));
        System.out.println(myIntegers.get(5));
        System.out.println(myIntegers.get(7));
        System.out.println(myIntegers.get(9));

    }
}
