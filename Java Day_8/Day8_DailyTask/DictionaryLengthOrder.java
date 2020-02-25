package com.day8dailytask;

import java.util.Scanner;

public class DictionaryLengthOrder {
	
public static void main(String[] args) {
		 
String[] Words = { "Ankit", "Pulkit", "Praveen", "Naveen"};

    for(int i = 0; i < 3; ++i) {
        for (int j = i + 1; j < 4; ++j) {
        	
            if (Words[i].compareTo(Words[j]) > 0) {

                String temp = Words[i];
                Words[i] = Words[j];
                Words[j] = temp;
            }
        }
    }

    System.out.println(" Lexicographical order of Words is: ");
    for(int k = 0; k < 4; k++) {
        System.out.println(Words[k]);
    }

}

}
