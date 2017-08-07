package com.concrete;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderCompost {
	
	public static void main(String[] args){
		Comparator<Student> c = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(Double.valueOf(o1.getCgpa()).compareTo(Double.valueOf(o2.getCgpa())) < 0)
					return 1;
				else if(Double.valueOf(o1.getCgpa()).compareTo(Double.valueOf(o2.getCgpa())) > 0)
					return -1;
				else {
					if(o1.getFname().compareTo(o2.getFname()) < 0)                          
						return -1;
					else if(o1.getFname().compareTo(o2.getFname()) > 0)
						return 1;
					else 
						return o1.getId() < o2.getId()? -1 : 1;                            
				}
			}
		};


		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		studentList.sort(c);
		studentList.stream().forEachOrdered(s -> System.out.println(s.getFname()));
		//		studentList.stream().sorted(c).forEachOrdered(s -> System.out.println(s.getFname()));		

	}
}