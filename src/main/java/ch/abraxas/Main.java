package ch.abraxas;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter community: ");
    String community = scanner.nextLine();

    System.out.print("Enter income: ");
    double income = scanner.nextDouble();

    TaxCalculator taxCalculator = new TaxCalculator();
    double tax = taxCalculator.calculateTax(community, income);

    System.out.println("Calculated Tax: " + tax);
  }
}