package com.concrete;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class ReflectionSolution {

        public static void main(String[] args) throws ClassNotFoundException{
        	String className = ReflectionSolution.class.getName().replace("ReflectionSolution", "DequeSolution");
            Class student = Class.forName(className);
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m : methods){
                methodList.add(m.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }
