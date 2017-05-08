package com.dss.client;
import com.dss.declaration.Message;
public class TestClient1 implements Message {
	public void morning(){
		System.out.println("good morning ");
	}
	public void evening(){
		System.out.println(" evening ");
	}
	public void goodnight(){
		System.out.println("good night ");
	}
	public static vopid main(String[] args){
		TestClient1 t = new TestClient1();
		t.morning();
		t.evening();
		t.goodnight();
	}
}