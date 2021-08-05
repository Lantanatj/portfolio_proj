package com.semicolon;
import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {

        int numb;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number number");
        numb = input.nextInt();
        System.out.println("The factors of " + numb + " are: ");
         for(int count = 1; count <= numb; count++) {
             if (numb % count == 0) {
                 System.out.print(count + " ");
             }
         }
    }
}
