package com.bptn.course.week1;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        int i;
        String s,s1, rev ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("/*................String Menu................*/");
        System.out.println("Press 1 for Palindrome Check");
        System.out.println("Press 2 to reverse a String");
        System.out.println("Press 3 to Concatenate two Strings");
        System.out.println("Press 4 for String Comparison");
        System.out.println("Press 5 to Calculate the Length of String");
        System.out.println("Enter the option:");

        i=sc.nextInt();
        sc.nextLine();

        switch(i)
        {
            case 1:
                System.out.println("Palindrome Check \n");
                System.out.println("Enter a string:");
                s = sc.nextLine();
                
                int leng = s.length();

                for ( int j = leng - 1; j >= 0; j-- )
                    rev = rev + s.charAt(j);
                if (s.equals(rev))
                    System.out.println(s+" is a palindrome");
                else
                    System.out.println(s+" is not a palindrome");

                break;

            case 2:
                System.out.println("String Reverse Printing\n");
                System.out.println("Enter a string:");
                
                s = sc.nextLine();
                
                int len = s.length();

                for ( int j = len - 1; j >= 0; j-- )
                    rev = rev + s.charAt(j);
                System.out.println(rev);
                break;

            case 3:
                System.out.println("String Concatenation\n");
                System.out.println("Enter First string:");
                s = sc.nextLine();
                System.out.println("Enter Second string:");
                s1 = sc.nextLine();
                
                String s3 = s + s1;
                System.out.println(s3);
                break;
                
            case 4:
                System.out.println("String Comparison\n");
                System.out.println("Enter First string:");
                s = sc.nextLine();
                System.out.println("Enter Second string:");
                s1 = sc.nextLine();
                if(s.equals(s1))
                    System.out.println("The entered strings are equal");
                else
                    System.out.println("The entered strings are not equal");
                break;
            
            case 5:
                System.out.println("Length of a string \n");
                System.out.println("Enter a string:");
                s = sc.nextLine();
                int leng1 = s.length();
                System.out.println("The length of the entered string is:"+leng1);
                break;
            
            default:
                System.out.println("Invalid choice!! Please make a valid choice !!!");
                break;
        }
        sc.close();
    }
}


