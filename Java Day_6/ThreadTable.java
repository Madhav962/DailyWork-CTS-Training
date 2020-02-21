package com.day6training;

public class ThreadTable {
	
		public static void main(String[] args) {
			System.out.println(Thread.currentThread().getName());
			TableResources res= new TableResources();
			TableResource2 res2=new TableResource2();
			ThreadTable1 demo1= new ThreadTable1(res); // New Born state
			ThreadTable2 demo2=new ThreadTable2(res2);

			Thread t1=new Thread(demo1);
			Thread t2= new Thread(demo2);
			 
			t1.start(); //READY sTATE
		    t2.start();

}
}
