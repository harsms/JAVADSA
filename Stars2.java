package com.patterns.matching;

public class Star2 {

	public void star(int n) {
		
		
		for(int  i = 0 ; i < n ; i ++) {
			
			for(int j = 0 ; j <= i; j++) {
				
				System.out.print("* ");
			}
			 System.out.println("\n");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Star2 star = new Star2();
		star.star(10);

	}

}
