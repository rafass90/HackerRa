package com.concrete;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class PhoneBookSolution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      Map<String, Integer> agenda = new LinkedHashMap<>();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         agenda.put(name, phone);
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         if(agenda.containsKey(s))
        	 System.out.println(s + "=" + agenda.get(s));
         else
        	 System.out.println("Not found");
      }
   }
}