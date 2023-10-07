import java.text.DecimalFormat;
import java.util.Scanner;

public class CC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double rupeeToDollarRate = 0.013;
        double rupeeToEuroRate = 0.012;
        double rupeeToPoundRate = 0.0097;
        double rupeeToAustralianRate = 0.019;
        double rupeeToAEDRate = 0.044;

        System.out.println("*** Welcome To The Currency Converter ***");
        System.out.println(" ");
        System.out.println("Enter 1 for Rupee");
        System.out.println("Enter 2 for Dollar");
        System.out.println("Enter 3 for Euro");
        System.out.println("Enter 4 for UK Pound");
        System.out.println("Enter 5 for Australian Dollar");
        System.out.println("Enter 6 for AED (United Arab Emirates Dirham)");

        System.out.println(" ");
        try {
            System.out.println(" ");
            System.out.println("Choose your desired currency");

            int choice = scanner.nextInt();
            System.out.println("Enter the amount");
            double amount = scanner.nextDouble();

            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            switch (choice) {
                case 1:
                    convertRupeeToOtherCurrencies(amount, decimalFormat, rupeeToDollarRate, rupeeToEuroRate, rupeeToPoundRate, rupeeToAustralianRate, rupeeToAEDRate);
                    break;
                case 2:
                    convertDollarToOtherCurrencies(amount, decimalFormat, 82.26, 0.98, 0.81, 1.55, 3.67);
                    break;
                case 3:
                    convertEuroToOtherCurrencies(amount, decimalFormat, 80.85, 1.02, 0.86, 1.66, 3.85);
                    break;
                case 4:
                    convertUKPoundToOtherCurrencies(amount, decimalFormat, 103.10, 1.24, 1.16, 1.92, 4.44);
                    break;
                case 5:
                    convertAustralianToOtherCurrencies(amount, decimalFormat, 53.63, 0.64, 0.60, 0.52, 2.33);
                    break;
                case 6:
                    convertAEDToOtherCurrencies(amount, decimalFormat, 22.70, 0.27, 0.26, 0.23);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }

    public static void convertRupeeToOtherCurrencies(double amt, DecimalFormat decimalFormat,
                                                     double dollarRate, double euroRate, double poundRate,
                                                     double australianRate, double aedRate) {
        System.out.println(" ");
        System.out.println("1 Rupee = " + decimalFormat.format(dollarRate) + " Dollar");
        System.out.println();
        System.out.println(amt + " Rupee = " + decimalFormat.format(amt * dollarRate) + " Dollar");
        System.out.println();

        System.out.println("1 Rupee = " + decimalFormat.format(euroRate) + " Euro");
        System.out.println();
        System.out.println(amt + " Rupee = " + decimalFormat.format(amt * euroRate) + " Euro");
        System.out.println();

        System.out.println("1 Rupee = " + decimalFormat.format(poundRate) + " UK Pound");
        System.out.println();
        System.out.println(amt + " Rupee = " + decimalFormat.format(amt * poundRate) + " UK Pound");
        System.out.println();

        System.out.println("1 Rupee = " + decimalFormat.format(australianRate) + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " Rupee = " + decimalFormat.format(amt * australianRate) + " Australian Dollar");
        System.out.println();

        System.out.println("1 Rupee = " + decimalFormat.format(aedRate) + " AED (United Arab Emirates Dirham)");
        System.out.println();
        System.out.println(amt + " Rupee = " + decimalFormat.format(amt * aedRate) + " AED (United Arab Emirates Dirham)");
        System.out.println();
    }

    public static void convertDollarToOtherCurrencies(double amt, DecimalFormat decimalFormat,
                                                      double rupeeRate, double euroRate, double poundRate,
                                                      double australianRate, double aedRate) {
        System.out.println("1 Dollar = " + decimalFormat.format(rupeeRate) + " Rupee");
        System.out.println();
        System.out.println(amt + " Dollar = " + decimalFormat.format(amt * rupeeRate) + " Rupee");
        System.out.println();

        System.out.println("1 Dollar = " + decimalFormat.format(euroRate) + " Euro");
        System.out.println();
        System.out.println(amt + " Dollar = " + decimalFormat.format(amt * euroRate) + " Euro");
        System.out.println();

        System.out.println("1 Dollar = " + decimalFormat.format(poundRate) + " UK Pound");
        System.out.println();
        System.out.println(amt + " Dollar = " + decimalFormat.format(amt * poundRate) + " UK Pound");
        System.out.println();

        System.out.println("1 Dollar = " + decimalFormat.format(australianRate) + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " Dollar = " + decimalFormat.format(amt * australianRate) + " Australian Dollar");
        System.out.println();

        System.out.println("1 Dollar = " + decimalFormat.format(aedRate) + " AED (United Arab Emirates Dirham)");
        System.out.println();
        System.out.println(amt + " Dollar = " + decimalFormat.format(amt * aedRate) + " AED (United Arab Emirates Dirham)");
        System.out.println();
    }

    public static void convertEuroToOtherCurrencies(double amt, DecimalFormat decimalFormat,
                                                    double rupeeRate, double dollarRate, double poundRate,
                                                    double australianRate, double aedRate) {
        System.out.println("1 Euro = " + decimalFormat.format(rupeeRate) + " Rupee");
        System.out.println();
        System.out.println(amt + " Euro = " + decimalFormat.format(amt * rupeeRate) + " Rupee");
        System.out.println();

        System.out.println("1 Euro = " + decimalFormat.format(dollarRate) + " Dollar");
        System.out.println();
        System.out.println(amt + " Euro = " + decimalFormat.format(amt * dollarRate) + " Dollar");
        System.out.println();

        System.out.println("1 Euro = " + decimalFormat.format(poundRate) + " UK Pound");
        System.out.println();
        System.out.println(amt + " Euro = " + decimalFormat.format(amt * poundRate) + " UK Pound");
        System.out.println();

        System.out.println("1 Euro = " + decimalFormat.format(australianRate) + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " Euro = " + decimalFormat.format(amt * australianRate) + " Australian Dollar");
        System.out.println();

        System.out.println("1 Euro = " + decimalFormat.format(aedRate) + " AED (United Arab Emirates Dirham)");
        System.out.println();
        System.out.println(amt + " Euro = " + decimalFormat.format(amt * aedRate) + " AED (United Arab Emirates Dirham)");
        System.out.println();
    }

    public static void convertUKPoundToOtherCurrencies(double amt, DecimalFormat decimalFormat,
                                                      double rupeeRate, double dollarRate, double euroRate,
                                                      double australianRate, double aedRate) {
        System.out.println("1 UK Pound = " + decimalFormat.format(rupeeRate) + " Rupee");
        System.out.println();
        System.out.println(amt + " UK Pound = " + decimalFormat.format(amt * rupeeRate) + " Rupee");
        System.out.println();

        System.out.println("1 UK Pound = " + decimalFormat.format(dollarRate) + " Dollar");
        System.out.println();
        System.out.println(amt + " UK Pound = " + decimalFormat.format(amt * dollarRate) + " Dollar");
        System.out.println();

        System.out.println("1 UK Pound = " + decimalFormat.format(euroRate) + " Euro");
        System.out.println();
        System.out.println(amt + " UK Pound = " + decimalFormat.format(amt * euroRate) + " Euro");
        System.out.println();

        System.out.println("1 UK Pound = " + decimalFormat.format(australianRate) + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " UK Pound = " + decimalFormat.format(amt * australianRate) + " Australian Dollar");
        System.out.println();

        System.out.println("1 UK Pound = " + decimalFormat.format(aedRate) + " AED (United Arab Emirates Dirham)");
        System.out.println();
        System.out.println(amt + " UK Pound = " + decimalFormat.format(amt * aedRate) + " AED (United Arab Emirates Dirham)");
        System.out.println();
    }

    public static void convertAustralianToOtherCurrencies(double amt, DecimalFormat decimalFormat,
                                                         double rupeeRate, double dollarRate, double euroRate,
                                                         double poundRate, double aedRate) {
        System.out.println("1 Australian Dollar = " + decimalFormat.format(rupeeRate) + " Rupee");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + decimalFormat.format(amt * rupeeRate) + " Rupee");
        System.out.println();

        System.out.println("1 Australian Dollar = " + decimalFormat.format(dollarRate) + " Dollar");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + decimalFormat.format(amt * dollarRate) + " Dollar");
        System.out.println();

        System.out.println("1 Australian Dollar = " + decimalFormat.format(euroRate) + " Euro");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + decimalFormat.format(amt * euroRate) + " Euro");
        System.out.println();

        System.out.println("1 Australian Dollar = " + decimalFormat.format(poundRate) + " UK Pound");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + decimalFormat.format(amt * poundRate) + " UK Pound");
        System.out.println();

        System.out.println("1 Australian Dollar = " + decimalFormat.format(aedRate) + " AED (United Arab Emirates Dirham)");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + decimalFormat.format(amt * aedRate) + " AED (United Arab Emirates Dirham)");
        System.out.println();
    }

    public static void convertAEDToOtherCurrencies(double amt, DecimalFormat decimalFormat,
                                                   double rupeeRate, double dollarRate, double euroRate,
                                                   double poundRate) {
        System.out.println("1 AED (United Arab Emirates Dirham) = " + decimalFormat.format(rupeeRate) + " Rupee");
        System.out.println();
        System.out.println(amt + " AED (United Arab Emirates Dirham) = " + decimalFormat.format(amt * rupeeRate) + " Rupee");
        System.out.println();

        System.out.println("1 AED (United Arab Emirates Dirham) = " + decimalFormat.format(dollarRate) + " Dollar");
        System.out.println();
        System.out.println(amt + " AED (United Arab Emirates Dirham) = " + decimalFormat.format(amt * dollarRate) + " Dollar");
        System.out.println();

        System.out.println("1 AED (United Arab Emirates Dirham) = " + decimalFormat.format(euroRate) + " Euro");
        System.out.println();
        System.out.println(amt + " AED (United Arab Emirates Dirham) = " + decimalFormat.format(amt * euroRate) + " Euro");
        System.out.println();

        System.out.println("1 AED (United Arab Emirates Dirham) = " + decimalFormat.format(poundRate) + " UK Pound");
        System.out.println();
        System.out.println(amt + " AED (United Arab Emirates Dirham) = " + decimalFormat.format(amt * poundRate) + " UK Pound");
        System.out.println();
    }
}
