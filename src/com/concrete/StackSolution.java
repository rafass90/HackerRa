package com.concrete;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class StackSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String,String> chaves = new LinkedHashMap<>();
//		chaves.put("{", "}");
//		chaves.put("[", "]");
//		chaves.put("(", ")");
		chaves.put("}", "{");
		chaves.put("]", "[");
		chaves.put(")", "(");

		while (sc.hasNext()) {
			String input=sc.next();
			Stack st = new Stack<String>();

			for (byte ch : input.getBytes()) {
				needPush(st, String.valueOf((char)ch), chaves);
			}
			System.out.println(st.isEmpty()? "true": "false");

		}

	}

	private static void needPush(Stack st, String v, Map<String,String> chaves) {
		if(st.size() == 0 || !st.peek().equals(chaves.get(v)))
			st.push(v);
		else if(st.peek().equals(chaves.get(v))){
			st.pop();
		}
	}


}
