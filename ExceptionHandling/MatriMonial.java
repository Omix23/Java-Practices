package ExceptionHandling;

import java.io.*;

import java.util.Scanner;

public class MatriMonial extends Customer {
    public static void main(String[] args) throws IneligibleForMarriageException {

        
        Scanner sc = new Scanner(System.in);
        MatriMonial m = new MatriMonial();
        String name ;
        int age;
        System.out.println("Enter name of Customer");
        name = sc.nextLine();
        System.out.println("Enter the age of Customer");
        age = sc.nextInt();
        m.male(name,age);
        m.female("Sanika", 20);
    }
}
