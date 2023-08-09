package com.example;


//중첩 클래스 : 클래스 안에 클래스 or 메소드 안에 클래스  => 변수의 특성을 갖는 클래스(정적, 인스턴스, 로컬) 
    

class Alpha{

}


public class NestedClassExample {
	
	int n1; // 인스턴스 필드, 힙에 생성, new 시점에 생성 , 참조카운트가 0 일 때 가비지컬렉터의 의해서 삭제  
	
	static int n2; // 메소드 영역(code area), 클래스가 코드 영역에 올라가면 생성. 

	
	
	class A { //인스턴스 멤버 클래스
		
		int a;
	}
	
	static class B { // 정적 멤버 클래스 
		
		void show() {};
	}
	
	
	public static void main(String[] args) {
		
		
		
		int n3; // 로컬변수, 스택변수, 자동변수, 임시변수 , 블럭이 끝나면 소멸 
		
	}

}
