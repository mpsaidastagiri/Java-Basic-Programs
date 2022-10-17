package org.example;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s="RB@@@aanngalore1221***";
        char [] characters = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c:characters){
            if(Character.isAlphabetic(c) && list.contains(c)){
                continue;
            }
            list.add(c);
        }
        list.stream().forEach(System.out::print);

    }
}
