package com.concrete;

import java.util.Scanner;

public class SolutionPrintf{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            int padd = 15 - s1.length();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
    }
}
//%s - string
//%2s  - padding left 2
//%-2s  - padding right 2
//%d - digito
//%03d - completa com 0, tamanho 3

