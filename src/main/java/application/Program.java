package application;

import util.Calculator;

import java .util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double priceDollar = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double value = sc.nextDouble();

        System.out.println("What is the IOF value? ex: 1.07");
        double priceIof = sc.nextDouble();

        double c = Calculator.currencyConverter(priceDollar, value, priceIof);

        System.out.printf("Amount to be paid in reais : %.2f%n", c);


        sc.close();
    }

}
