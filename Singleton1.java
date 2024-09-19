package com.design.pattern.singleton;

public class Singleton1 {
	public static void main(String[] args) {
		TestSingleton1 i1=TestSingleton1.getInstance();
		TestSingleton1 i2=TestSingleton1.getInstance();
		System.out.println(i1);
		System.out.println(i2);
		/*TestSingleton1 ii = null;
		test1 t1=new test1(ii);
		t1.start();
		test2 t2=new test2(ii);
		t2.start();*/
		//Thread th1=new Thread();
	}

}
class TestSingleton1{
	
	private  static TestSingleton1 instance =null;
	private TestSingleton1(){
		
	}
	public static TestSingleton1 getInstance(){
		if(instance==null)
			synchronized (TestSingleton1.class) {
				 instance =new TestSingleton1();
			}
		return instance;
	} 
}
/*class test1 extends Thread{
	TestSingleton1 i;
	test1(TestSingleton1 i){
		this.i=i;
	}
	public void run(){
		System.out.println(i.getInstance());
	}
}

class test2 extends Thread{
	TestSingleton1 i;
	test2(TestSingleton1 i){
		this.i=i;
	}
	public void run(){
		for(int i1=0;i1<3;i1++){
			System.out.println(i.getInstance());

		}
	}
}*/