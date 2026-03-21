package com.bsm.feature.string;

public class RemoveAllWhiteSpaces {
    static void main() {
        String str = " Hello to all ";
        str = str.replaceAll("\\s","");
        System.out.println(str);
    }
}
