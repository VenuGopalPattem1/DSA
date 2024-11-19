package com.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("[^a-zA-Z0-9]");
		Matcher m=p.matcher("ab c$123#iJk^45 6*pQr @ wXYz");
		int c=0;
		while(m.find()) {
			System.out.println(m.start()+" ====> "+m.end()+" ====> "+m.group());
			c++;
		}
		System.out.println("count "+c);
	}
}
