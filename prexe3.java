import java.util.Scanner;
public class prexe3 {
    public static void main(String[] args) {
    Scanner cp=new Scanner(System.in);
    System.out.println("Enter cost price of product: ");
    double costPrice=cp.nextDouble();
    Scanner sp=new Scanner(System.in);
    System.out.println("Enter selling price of product: ");
    double sellingPrice=sp.nextDouble();
    String porl=(sellingPrice>costPrice)?"Profit":(sellingPrice<costPrice)?"Loss":(sellingPrice==costPrice)?"No Profit No Loss":"";
    System.out.println("The transaction resulted in: " + porl + ".");
    double netproforloss=(sellingPrice>costPrice)?(sellingPrice-costPrice):(costPrice-sellingPrice);
    System.out.println("The net profit or loss is: " + netproforloss + ".");
    double percentage=(sellingPrice>costPrice)?(netproforloss/costPrice)*100:(netproforloss/costPrice)*100;
    System.out.println("The percentage of profit or loss is: " + percentage + "%.");
    cp.close();
    sp.close();
    }
}
