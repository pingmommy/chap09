package com.example;



public class OuterThisExample2 {

	int num =100;
	
	
	
	class A {
		
		
			int num =200;
			
			void xxx() {
				
			   int num = 300;
			    
			    System.out.println("num"+num);
			    System.out.println("A.num"+ this.num);
			    System.out.println("OuterThisExample2.A.num"+OuterThisExample2.this.num);
			    
			}
			
			
		}
	
	
		
	public static void main(String[] args) {
	
		OuterThisExample2 o = new OuterThisExample2();
		
		A a = o.new A();
		
		a.xxx();
 
}
}
