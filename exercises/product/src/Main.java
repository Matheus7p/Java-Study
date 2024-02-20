import entities.product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price: ");
        double price = sc.nextDouble();

        System.out.println("Quantity: ");
        int quantity = sc.nextInt();

        product p = new product(name, price, quantity);

        System.out.println(p.toString());

        p.addProduct(5);

        System.out.println("-------------------------------------");

        System.out.println(p.toString());

        System.out.println("-------------------------------------");

        p.removeProduct(3);

        System.out.println(p.toString());

    }
}