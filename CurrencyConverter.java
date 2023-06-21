import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;

        // Enter the amount in Indian Rupees (INR)
        System.out.print("Enter the amount in INR: ");
        amount = scanner.nextDouble();

        // Convert INR to USD
        double usd = amount * 0.014;

        // Convert INR to EUR
        double eur = amount * 0.012;

        // Convert INR to GBP
        double gbp = amount * 0.010;

        // Convert INR to JPY
        double jpy = amount * 1.53;

        // Print the converted amounts
        System.out.println("Amount in USD: " + usd);
        System.out.println("Amount in EUR: " + eur);
        System.out.println("Amount in GBP: " + gbp);
        System.out.println("Amount in JPY: " + jpy);
    }
}
