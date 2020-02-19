package com.trainingdata;
import java.util.Scanner;



public class Toggled {
public static void main(String[] args) {
System.out.println("Enter a String");  
Scanner sc=new Scanner(System.in);

String line =sc.nextLine();
char[] arr= line.toCharArray();

for(char ch: arr)
  {
if(Character.isUpperCase(ch)){
ch= Character.toLowerCase(ch);
}
else if(Character.isLowerCase(ch)){
    ch= Character.toUpperCase(ch);
}
System.out.print(ch);
}}} 