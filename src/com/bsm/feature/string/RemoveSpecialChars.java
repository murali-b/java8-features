package com.bsm.feature.string;

public class RemoveSpecialChars {
    static void main() {
        String str = "skks904@$$#sdlsd#@";
        str = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }
}
