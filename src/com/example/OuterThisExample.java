package com.example;



public class OuterThisExample {

	int num =100;
	static int num2 = 200;
	
	
	class A {
		
		static int a =100; 
		 int b=10;
		
		void xxx() {
			num =num+100;
			num2= num2+200;
		}
		

	}
	
	
	
	static class B{
		
		void xxx() {
			//num = num+100;
		    num2=num2+200;
		    
		    
		}
		
	}
	
	
	void pp() {
		A c = new A();
		int v = A.a+num2+c.b;
	}
		
	public static void main(String[] args) {
	
		
		int a =10;
		
		a += 10;
		
	
		
		
	class C{
		int n1;
		static int n2;
	    
		void add() {
			n2= n2+20;
		}
		
		
	 }
	 
	 C c = new C();
     c.n1=10;
     c.n2= 20;
	 int n2 = 10;
    System.out.println(n2);

	}	

}
