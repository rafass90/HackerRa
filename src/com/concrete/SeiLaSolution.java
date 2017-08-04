package com.concrete;
import java.util.Scanner;

public class SeiLaSolution {

    public static void main(String[] args) {
    	
        try (Scanner scanner = new Scanner(System.in);)
        {
        	int arr[] = new int[scanner.nextInt()];
        	
        	for(int d = 0;d < arr.length; d++){
        		arr[d] = scanner.nextInt();
        	}
        	int init = 0;
        	int fin = arr.length;
        	
        	int totalLines = 0;
        	for(int a = 0;a< fin;a++){
        		int soma = 0;
//        		System.out.println("a" + a);
        		for(int b = a;b< fin;b++){
//        			System.out.println("b" + b);
        			soma += arr[b];
        			if(soma <= 0)
        				totalLines ++;
//        			System.out.println("soma" + soma);
        		}
        	}
        	System.out.println(totalLines);
        
        }
    }
}
