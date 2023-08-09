package com.example;


// 인터페이스도 클래스다. 

    
interface Movable{

}


public class NestedInterfaceExample {
	
// 클래스 안에 인터페이스를 설계하는 이유는 클래스와 밀접한 관련이 있기 때문. 	
	
	interface Showable{
		void show();
	    void hide(); 
	}
	
	
	public static void main(String[] args) {
		
	//로컬인터페이스도 문법적으로는 되지만 쓸 일이 거의 없다. 	
	interface ss{
			void xx();
			
		}
		
		
	}

}
