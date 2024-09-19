package com.design.pattern.singleton;

import java.util.*;

@SuppressWarnings("unchecked")
public class Singleton3 {
	
	private static Set singletonSet1 = new HashSet();
	public static Set singletonSet = Collections.synchronizedSet(singletonSet1);
	public static void main(String[] args) {
		//Singleton concept is broken here
		for( int i = 0 ; i < 100 ; i++ )
		{
			new test3().start();
			new test4().start();

			if( singletonSet.size() > 1 )
				break;
			else
				continue;
		}
		System.out.println(singletonSet);

	}

}
class TestSingleton3{
	
	private  static TestSingleton3 instance =null;
	private TestSingleton3(){
		
	}
	public static TestSingleton3 getInstance(){
		if(instance==null)
			synchronized (TestSingleton1.class) {
				 instance =new TestSingleton3();
			}
		return instance;
	} 
}
class test3 extends Thread{
	
	public void run(){
		TestSingleton3 instance=TestSingleton3.getInstance();
		Singleton3.singletonSet.add(instance);
	}
}

class test4 extends Thread{
	
	public void run(){
		TestSingleton3 instance=TestSingleton3.getInstance();
		Singleton3.singletonSet.add(instance);
	}
}