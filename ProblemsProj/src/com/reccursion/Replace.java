package com.reccursion;

public class Replace {
    static String replace(String s, int l) {
        if (l < 3) {
            return s.substring(0,l+1);
        } else if (s.substring(l-3,l+1).equals("venu")) {
            return replace(s, l - 4) + "1";
        } else {
            return replace(s, l - 1) + s.charAt(l);
        }
    }
    
    static int c=0;
    static int count(int n) {
    	if(n<=0)
    		return c;
    	else {
    		c++;
    		return count(n/10);
    	}
    }
    
    static int a=0;
    static int countWord(String s,int l) {
    	if(l<=0)
    		return a;
    	else if(s.substring(l-3,l+1).equals("venu"))
    	{
    		a++;
    		return countWord(s, l-4);
    	}
    	else
    		return countWord(s, l-1);
    }
    
    static String replace1(String s,int l) {
    	if(l<4)
    		return s.substring(0,l+1);
    	else if(s.substring(l-4,l+1).equals("gopal"))
    		return replace1(s, l-5)+"vinod";
    	else 
    		return replace1(s, l-1)+s.charAt(l);
    }
    
//    static String replace1(String s,int l) {
//    	if(l<0)
//    		return "";
//    	else if(s.charAt(l)=='v')
//    		return replace1(s, l-1)+"#";
//    	else 
//    		return replace1(s, l-1)+s.charAt(l);
//    }
    
    

    public static void main(String[] args) {
        String s = "1214 venu gopal is venu gopal is venu gopal 11";
//        System.out.println(replace(s, s.length() - 1));
//        int a=1237454544;
//        System.out.println(count(a));
//        System.out.println(countWord(s,s.length()-1));
        System.out.println(replace1(s, s.length() - 1));

    }
}
