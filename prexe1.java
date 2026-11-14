import java.util.Scanner;
public class prexe1 {
    public static void main(String[] args) {
      Scanner name=new Scanner(System.in);
      System.out.println("Enter your name: ");
      String Name=name.nextLine();
      Scanner age=new Scanner(System.in);
      System.out.println("Enter your age: ");
      int Age=age.nextInt();
      System.out.println("Hello " + Name + ", you are " + Age + " years old.");
      name.close();
      age.close();
    }
}