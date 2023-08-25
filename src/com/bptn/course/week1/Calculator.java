package com.bptn.course.week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double a,b,result;
        int choice,condition;
        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println("/*................Calculator Menu................*/");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for finding Square");
            System.out.println("Press 6 for finding Square root");
            System.out.println("Press 7 for finding Reciprocal");

            choice=scanner.nextInt();

            if(choice==1) {
                System.out.println("Enter the first number");
                a=scanner.nextDouble();
                System.out.println("Enter the second number");
                b=scanner.nextDouble();

                result=a+b;

                System.out.println("The sum of the numbers "+a+" and "+b+" is = "+result);
            }

            else if(choice==2) {
                System.out.println("Enter the first number");
                a=scanner.nextDouble();
                System.out.println("Enter the second number");
                b=scanner.nextDouble();

                result=a-b;

                System.out.println("The difference of the numbers "+a+" and "+b+" is = "+result);
            }
            else if(choice==3) {

                System.out.println("Enter the first number");
                a=scanner.nextDouble();
                System.out.println("Enter the second number");
                b=scanner.nextDouble();

                result=a*b;

                System.out.println("The product of the numbers "+a+" and "+b+" is = "+result);
            }
            else if(choice==4) {

                System.out.println("Enter the first number");
                a=scanner.nextDouble();
                System.out.println("Enter the second number");
                b=scanner.nextDouble();
                result=a/b;

                System.out.println("Dividing "+a+" by "+b+" the quotient is "+result);
                System.out.println("The remainder is "+(a%b));
            }
            else if(choice==5) {

                System.out.println("Enter the number to find Square");
                a=scanner.nextDouble();

                result=a*a;
                System.out.println("The Square of the number "+a+" is = "+result);
            }
            else if(choice==6) {
                System.out.println("Enter the number to find Square root");
                a=scanner.nextDouble();

                result=Math.sqrt(a);
                System.out.println("The Square root of the number "+a+" is = "+result);
            }
            else if(choice==7) {
                System.out.println("Enter the number to find Reciprocal");
                a=scanner.nextDouble();

                result=1/a;
                System.out.println("The Reciprocal of the number "+a+" is = "+result);
            }
            else {
                System.out.println("Invalid choice! Please make a valid choice.");
            }

            System.out.println("To continue calculation Press 1 else Press any other number button to exit");

            condition=scanner.nextInt();

        }while(condition==1);
        scanner.close();
    }

}



