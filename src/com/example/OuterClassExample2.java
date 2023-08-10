package com.example;

// 로컬 클래스는 바깥클래스의 모든 필드와 메소드에 사용할 수 있나?
// => 로컬클래스가 포함된 메소드가 정적 메소드이면 인스턴스 변수는 사용할 수 없다. 
//로컬 클래스의 매개변수가 로컬변수는 final특성을 갖는다.(상수처럼)

public class OuterClassExample2 {

	int n1;
	static int n2;
	
	class A {
		
		void xxx() {
			System.out.println(n1);
            System.out.println(n2);
		}
	}
	
	static class B{
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {

		
		
	 class C{
		
		 void xxx() {
			// System.out.println(n1);
            System.out.println(n2);
		}
	    
		
	 }
	  
		
	}




	
	
	
	

}
