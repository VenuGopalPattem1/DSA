package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClassA {
    public static void main(String[] args) {
    	String [] s={"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book","Stapler"};
    	Map<String,Integer> m=new HashMap<String,Integer>();
    	for(String names:s) {
    		m.put(names, m.getOrDefault(names, 0)+1);
    	}
    	Set<String> a=m.keySet();
    	for(String t:a)
    		System.out.println(t+"  "+m.get(t));
    }
}

