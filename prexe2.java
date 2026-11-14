import java.util.Scanner;
public class prexe2 {
    public static void main(String[] args) {
      Scanner temp=new Scanner(System.in);
       System.out.println("Enter temperature in Celsius: ");
        double celsius=temp.nextDouble();
        String Wheather=(celsius>=30)?"hot":(celsius<30 && celsius>15)?"warm":(celsius<=15)?"cold":"";
        System.out.println("The weather is " + Wheather + ".");
        temp.close();
    }
    
}
