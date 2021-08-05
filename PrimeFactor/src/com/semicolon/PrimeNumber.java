package com.semicolon;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int numb;
        boolean isPrime = true;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter any number:");
        numb = input.nextInt();

        for(int i=2;i<=numb/2;i++)
        {

            if(numb % i == 0)
            {
                isPrime=false;
            }
        }

        if(isPrime) {
            System.out.println(numb + " is a Prime Number");
        }
        else
        {
            System.out.println(numb + " is not a Prime Number");
        }
    }
    }
