package com.concrete;

import java.util.Scanner;

public class SolutionScanner {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        Double d = scan.nextDouble();
        
        String s = "";
        do{
            s = scan.nextLine();
        }while(s.length() == 0);

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

