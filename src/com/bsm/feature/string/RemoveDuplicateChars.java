package com.bsm.feature.string;

public class RemoveDuplicateChars {
    static void main() {
        String str = " Hello to all ";
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int idex = str.indexOf(ch,i+1);
            if(idex == -1){
                sb2.append(ch);
            }
        }
        System.out.println(sb2);
    }
}
