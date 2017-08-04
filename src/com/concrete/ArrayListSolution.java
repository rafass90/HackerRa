package com.concrete;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSolution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int totalLists = in.nextInt();
		int listSize,q,x,y;
		ArrayList[] set = new ArrayList[totalLists];
		for(int i=0;i<totalLists;i++){
			listSize = in.nextInt();
			set[i] = new ArrayList();
			for(int j=0;j<listSize;j++){  
				set[i].add(in.nextInt());                
			}
		}
		q=in.nextInt();
		for(int i=0;i<q;i++){
			x=in.nextInt();
			y=in.nextInt();
			try{
				System.out.println(set[x-1].get(y-1));
			} catch(Exception e){
				System.out.println("ERROR!");
			}
		}
	}
}
