package com.pluralsight;

import java.util.Scanner;

public class SanShop {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // choose sandwich and price

        System.out.println("Choose sandwich size:");
        System.out.println("1) Regular  - $5.45");
        System.out.println("2) Large    - $8.95");
        System.out.print("Enter 1 or 2: ");
        int Size = myScanner.nextInt();

        // Age for discount
        //create an age
        int age=43;
        if age (>=17){
            System.out.println("give 10% discount");
        else{
            System.out.println("no discount");
            }
        }

        System.out.print("Enter your age: ");
        int age = myScanner.nextInt();


        // Discounts: <=17 → 10%, >=65 → 20%, otherwise 0%
        double price = 5.45, 8.95;
        if (age < 18) {
            price = price * .9;
        }
        System.out.println("Price of admission: " + price);
    }
}













