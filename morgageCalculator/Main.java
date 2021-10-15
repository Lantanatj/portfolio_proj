package morgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int  principal = (int)readNumberFromScanner("Pls input the Principal amount: ",1000,1000000000);
         float annualInterest = (float) readNumberFromScanner("Pls input the Annual Interest rate: ",0,30);
         byte loanTenure = (byte) readNumberFromScanner("Loan Period(years): ",1,10);

        double mortgage = calculateMortgage( principal,annualInterest, loanTenure);
    }
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
//        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayment = loanTenure * MONTHS_IN_YEAR;

//        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment))
//                / (Math.pow(1 + monthlyInterest, numberOfPayment)-1);

        double mortgage = principal * Math.pow(1.0 + annualInterestInPercent, loanTenure);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("The mortgage is: " + mortgageFormatted );

        return mortgage;
    }
}
