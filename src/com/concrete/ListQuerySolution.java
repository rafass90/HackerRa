package com.concrete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListQuerySolution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeArray = scan.nextInt();//recebo tamanho da lista
		List<String> arr = new ArrayList();

		for(int index = 0; index < sizeArray;index++){
			int n = scan.nextInt();// recebo valores da lista
			arr.add(String.valueOf(n));
		}
		int queryCount = scan.nextInt();//recebo quantidade de querys
		List<List<Integer>> aaa = new ArrayList();
		for(int index = 0; index < queryCount;index++){
			String op = scan.next();//insiro operacao
			if("Insert".equals(op)){
				aaa.add(Arrays.asList(scan.nextInt(),scan.nextInt()));// valores para operacao de insert
			}else{
				aaa.add(Arrays.asList(scan.nextInt()));// valores para operacao de delete
			}	
		}
		scan.close();
		
		for (List<Integer> list : aaa) {
			if(list.size() == 2){//insert
				arr.add(list.get(0),String.valueOf(list.get(1)));
			}else{//delete
				arr.remove((int)list.get(0));
			}
		}
		arr.stream().forEach(d -> System.out.print(d + " "));
	}
}
