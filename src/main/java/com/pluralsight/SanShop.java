package com.pluralsight;

import java.util.Scanner;

public class SanShop {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // choose sandwich and price
        double price = 0.0;
        System.out.println("Choose sandwich size:");

        System.out.println("1) Regular  - $5.45");
        System.out.println("2) Large    - $8.95");
        System.out.print("Enter 1 or 2: ");

        int Size = myScanner.nextInt();
        if (Size==1 ){
            price = 5.45;
        }
        else if (Size==2){
            price=8.95;
        }

        myScanner.nextLine();
        System.out.println("do you want a sandwich loaded? Answer yes or no");
        String loaded = myScanner.nextLine();
        if ((loaded.equalsIgnoreCase("yes")) && (Size==1)){
            System.out.println("charge 1$");
            price += 1;
        }
        else if ((loaded.equalsIgnoreCase("yes")) && (Size==2)){
            System.out.println("charge 1.75$");
            price += 1.75;
        }
        else if (loaded.equalsIgnoreCase("no")){
            System.out.println("no extra charge");
        }



        System.out.println("how old student is:");
        int age = myScanner.nextInt();
        if (age<=17){
           System.out.println("give 10%discount");
           price -= (price * 0.1);
        } else if (age>=65) {
            System.out.println("give 20% discount");
            price -= (price*0.2);
        }
        String name = "dog";
         System.out.printf("the price is: %.2f your order name: %s", price, name);


    }
}













