
import java.util.Scanner;

public class ARRAY_TOPIC6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);cd 

        double[] penPrice = {2.00, 12.00, 50.00, 30.00};
        double[] bookPrice = new double[4];
        double[] markerPrice = new double[4];
        double[] totalPrice = new double[4];

        for (int i = 0; i < bookPrice.length; i++) {
            System.out.println("Enter price for book" + (i + 1) + ":");
            bookPrice[i] = scanner.nextDouble();
        }

        for (int i = 0; i < markerPrice.length; i++) {
            System.out.println("Enter price for marker" + (i + 1) + ":");
            markerPrice[i] = scanner.nextDouble();
        }

        for (int i = 0; i < totalPrice.length; i++) {
          totalPrice[i]=bookPrice[i]+markerPrice[i]+penPrice[i];
          System.out.println("the total price for pen,book,marker at totalprice [ " +i+ " ] is RM "+totalPrice[i]);
        }
        scanner.close();
    }
}
