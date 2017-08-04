package com.concrete;
import java.util.Scanner;

public class HourGlassSolution {

    public static void main(String[] args) {
    	int a[][] = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        try (Scanner scanner = new Scanner(System.in);)
        {
            for(int i = 0; i < 6; i++)
            {
                for(int j = 0; j < 6; j++)
                {
                    a[i][j] = scanner.nextInt();
                    if (i > 1 && j > 1)
                    {
                        int sum =
                            a[i][j]
                            + a[i][j-1]
                            + a[i][j-2]
                            + a[i-1][j-1]
                            + a[i-2][j]
                            + a[i-2][j-1]
                            + a[i-2][j-2];
                        if (sum > maxSum) {maxSum = sum;}
                    }
                }
            }
        }
        System.out.println(maxSum);
        
//        00 01 02
//        10 11 12
//        20 21 22
//        
//        10 11 12
//        20 21 22
//        30 31 32
//        
//        33 34 35
//        43 44 45
//        53 54 55
    }
}
