//Concatenate Two Arrays using arraycopy

package com.array.day9_dailytask;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateUsingArrayCopy {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        System.out.print("Enter array Size:");
        int n = s.nextInt();
        int a[] = new int[n];
        int b[]= new int[n];
        System.out.println("Enter  the elements of Array-1:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Enter  the elements of Array-2:");
        for(int i = 0; i < n; i++)
        {
            b[i] = s.nextInt();
        }
        
        int A1Length=a.length;
        int A2Length=b.length;
        int Result[]= new int[A1Length+A2Length];
        System.arraycopy(a, 0, Result, 0, A1Length);
        System.arraycopy(b, 0, Result, A1Length, A2Length);
        System.out.println(Arrays.toString(Result));
        
	}

}
