package com.example;

import com.example.OuterClassExample2.A;
import com.example.OuterClassExample2.B;

//class Alpha{   } Alpha1


public class OuterClassExample {

	class A {
		int a1;
		void show() {
			System.out.println("인스턴스클래스 A "+a1);
		}
	}
	
	static class B{
		int b1;
		void show(){
			System.out.println("스태틱 클래스 B "+b1);
	  }
	}
	class Alpha{  //Alpha2
		
	}
	
	public static void main(String[] args) {

		class Alpha{  //Alpha3
			
		}
		
		class C{
			void print() {
				System.out.println("local C");
		   }
		}
		
		//A a= new A();
		
		
					OuterClassExample x = new OuterClassExample();
					
					A a = x.new A();
					
					a.a1=100;
					a.show();
					
					B b = new B();
					b.b1=200;
					b.show();
				
					C c= new C();
					c.print();

	}
	
	
	
}


/* Alpha1이 안 되는 이유 : 같은 이름의 클래스파일(바이트파일)이 존재함. => 같은 패키지에 같은 클래스명이 있다는 의미. 

 Alpha2, Alpha3이 되는 이유 : 중첩클래스로 종속되는 곳이 달라서 클래스파일 이름이 다 다름.
   
  Alpha2 = OuterClassExample$Alpha.class 
  Alpha3 = OuterClassExample$1Alpha.class

*/