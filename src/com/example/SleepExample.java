package com.example;

public class SleepExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("10초 후에 종료됩니다.");
		Thread.sleep(10000);
		System.out.println("종료");
	}

}
