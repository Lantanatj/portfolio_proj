package chapter7;
import java.util.Scanner;

public class ResultSheet {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in ) ;

        double [] scores= new double [5] ;
        int i=0;
        for ( ; i<4; i++) {
            System.out.println("Please, input score for " + " subject" + (i + 1));

            scores[i] = input.nextDouble();

            if(scores[i] < 1 || scores[i] > 100) {
                System.out.println("Please, input a valid score:");
                scores[i] = input.nextDouble();

            }

        }

        double sum=0;
        double min=scores[0];
        double max=scores[0];
        int minAvg=1;
        int maxAvg=0;

        for ( i=0; i<=4; i++)
        {
            sum = sum+scores[i] ;
            if(scores[i]>max)
            {
                max=scores[i];
            }

            if(scores[i]<min)
            {
                min=scores[i];
            }
        }


        double avg= sum/5;
        for ( i=0; i<=4; i++)
        {
            if(scores[i]>avg)
            {
                maxAvg++;
            }
            if(scores[i]<avg)
            {
                minAvg++;
            }
        }

        System.out.println("The average is " +avg + ", the minimum is " + min + " and the maximum is " + max);
        System.out.println("4.The number of students with an average score greater than the average score of all students is "+maxAvg);
        System.out.println("5.The number of students with an average score less than the average score of all students is "+minAvg);
        System.out.println();
        System.out.println("Scores entered for StId-1 are:");
            for(double grade:scores){
                System.out.print( grade + "," );
            }
        System.out.println();
    }

    }

