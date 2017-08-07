package com.concrete;
import java.util.BitSet;
import java.util.Scanner;

public class BiSetSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		BitSet a = new BitSet();
		BitSet b = new BitSet();

		int m = in.nextInt();

		for (int i = 0; i < m; i++) {
			String op = in.next();
			Integer list = in.nextInt();
			Integer index = in.nextInt();

			switch (op) {
			case "AND":
				if(list == 1) a.and(b); else b.or(a);break;
			case "OR":
				if(list == 1) a.or(b); else b.or(a);break;
			case "XOR":
				if(list == 1) a.xor(b); else b.xor(a);break;
			case "FLIP":
				if(list == 1) a.flip(index); else b.flip(index); break;
			case "SET":
				if(list == 1) a.set(index); else b.set(index);break;
			default:
				break;
			}
			System.out.print(a.cardinality() + " ");
			System.out.print(b.cardinality() + "\n");

		}

	}
}