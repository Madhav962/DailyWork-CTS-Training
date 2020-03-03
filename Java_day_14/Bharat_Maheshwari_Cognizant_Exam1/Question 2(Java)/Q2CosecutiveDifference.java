package com.test.programs;

import java.util.Scanner;

public class Q2CosecutiveDifference {

	public static void main(String[] args) {
		
				Scanner src = new Scanner(System.in);
				System.out.println("Enter the number: ");
				int OriginalNumber = src.nextInt();
				int TensPlace, UnitsPlace, diff;
				TensPlace = OriginalNumber/10;
				UnitsPlace = OriginalNumber%10;
				if(TensPlace > UnitsPlace)
					diff = TensPlace - UnitsPlace;
				else 
					diff = UnitsPlace - TensPlace;
				System.out.println("Difference is: " + diff);
				System.out.print("Final number is: ");
				String str1 = Integer.toString(diff);
				String str2 = Integer.toString(UnitsPlace);
				System.out.println(str1 + str2);
			}
		}

