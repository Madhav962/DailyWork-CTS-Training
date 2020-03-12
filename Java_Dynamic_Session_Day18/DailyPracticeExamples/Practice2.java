package com.dailypractice.cts;

public class Practice2 {
	public int i;
	public Practice2(int i)
	{
		this.i=i;
	}
public static void main(String...args) {
	Practice2 p1= new Practice2(334);
	Practice2 p2=p1;
	p2.i=998;
	System.out.println(p2.i+"\t"+p1.i);
	
}
}
