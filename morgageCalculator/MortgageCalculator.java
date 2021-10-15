package morgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static double readNumberFromScanner(String prompt,double min,double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextFloat();
            if(value >= min && value <= max){
                break;
            }
            System.out.println("Pls enter a value between " +min+ " and " + max);
        }
        return value;
    }
    public static double calculateMortgage(int principal, float annualInterest, byte loanTenure){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float annualInterestInPercent = annualInterest / PERCENT;
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayment = loanTenure * MONTHS_IN_YEAR;

       double mortgage= principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment))
               / (Math.pow(1 + monthlyInterest, numberOfPayment)-1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        double totalPayBackLoan = principal * Math.pow(1.0 + annualInterestInPercent, loanTenure);
        String payBackLoanFormatted = NumberFormat.getCurrencyInstance().format(totalPayBackLoan);
        System.out.println("The totalPayBackLoan is: " + payBackLoanFormatted );
        System.out.println("The total mortgage is: "+ mortgageFormatted);

        return totalPayBackLoan;
    }
}

