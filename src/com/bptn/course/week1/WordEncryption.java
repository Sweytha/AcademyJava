package com.bptn.course.week1;

import java.util.Scanner;

public class WordEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to encrypt: ");
        String word = scanner.nextLine();

        String encryptedWord = "";

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            // Encrypt lowercase letters
            if (Character.isLowerCase(currentChar)) {
                int encryptedCharValue = (currentChar - 'a' + 1) % 26;
                char encryptedChar = (char) (encryptedCharValue + 'a');
                encryptedWord += encryptedChar;
            }
            // Encrypt uppercase letters
            else if (Character.isUpperCase(currentChar)) {
                int encryptedCharValue = (currentChar - 'A' + 1) % 26;
                char encryptedChar = (char) (encryptedCharValue + 'A');
                encryptedWord += encryptedChar;
            }
            // Leave non-alphabetic characters unchanged
            else {
                encryptedWord += currentChar;
            }
        }

        System.out.println("Encrypted word: " + encryptedWord);
        scanner.close();
    }
}


