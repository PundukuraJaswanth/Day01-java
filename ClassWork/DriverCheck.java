package ClassWork;

public class DriverCheck {
    /**
     * @param args
     */
    public static void main(String[] args){
        final var d1 = new Driver();
        
        d1.cellNo = 6303180;
        d1.empno = 1322;
        d1.name = "Jaswanth";
        d1.VechicleNumber = "AP132N1";
        d1.Salary = 20000;
        System.out.println("Tax is  = " + d1.findTax());

    }
    
}
