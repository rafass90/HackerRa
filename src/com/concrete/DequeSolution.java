package com.concrete;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DequeSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            deque.addLast(in.nextInt());
        }

        int uniques = 0;
        for (int i = 0; i < n-m+1; i++) {
        	uniques += onlyUnique(deque, m, i);
        	deque.addLast(deque.pop());
		}
        
        System.out.println(uniques);
    }

	private static int onlyUnique(final Deque deque, int m, int jump) {
		Deque dequeReserva = new ArrayDeque<>();
		HashSet s = new LinkedHashSet<>();
		for (int i = 0; i < m; i++) {
			Integer ss = (Integer)deque.pop();
			dequeReserva.addFirst(ss);
			s.add(ss);
		}
		while(!dequeReserva.isEmpty()){
			deque.addFirst(dequeReserva.pop());
		}
		
		return s.size() == m? 1 : 0;
		
	}
}