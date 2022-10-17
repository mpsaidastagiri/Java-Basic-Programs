package org.example;

public class palindrome {
    public static void main(String[] args) {
        String s="radar";
        String rev ="";
        for(int i=s.length()-1;i>=0;--i)
        {
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.println("Reverse String is Palindrome");
        }
        else {
            System.out.println("Reverse String is not a Palindrome");
        }
        System.out.println(s);
        System.out.println(rev);
    }
}
