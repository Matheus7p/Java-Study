import entities.Account;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        String name = sc.next();

        Account ac = new Account(number, name);

        System.out.print("Is there na initial deposit (y/n)? ");
        char aux = sc.next().charAt(0);

        if(aux == 'y'){
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            ac.deposit(deposit);
            System.out.println();
            System.out.println("Account data: \n" + ac);
        }else{
            System.out.println("Account data: \n" + ac);
        }

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        ac.deposit(deposit);

        System.out.println();
        System.out.println("Updated account data: \n" + ac);


        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        ac.withdraw(withdraw);


        System.out.println("Updated account data: " + ac);


    }
}