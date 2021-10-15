package morgageCalculator;



public class Main {
    public static void main(String[] args) {

        int principal = (int) MortgageCalculator.readNumberFromScanner("Pls input the Principal amount: ", 1000, 1000000000);
        float annualInterest = (float) MortgageCalculator.readNumberFromScanner("Pls input the Annual Interest rate: ", 0, 30);
        byte loanTenure = (byte) MortgageCalculator.readNumberFromScanner("Loan Period(years): ", 1, 10);

        MortgageCalculator.calculateMortgage(principal, annualInterest, loanTenure);
    }

}