package com.trainingdata;

public class NumberPalindrome {

	public static void main(String[] args) {

int num=98889, Remainder,ReverseNumber=0,Number=0;
num = Number;
while(num!=0)
{
	Remainder= num%10;
	ReverseNumber= ReverseNumber*10+ Remainder;
	num /= 10;
}
if(Number==ReverseNumber)
{
	System.out.println("The Number is Palindrome");
}else
{
	System.out.println("The Number is Not Palindrome");
}
	}

}
