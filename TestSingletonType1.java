package com.design.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestSingletonType1 {
	public static void main(String[] args) 
	{
		new TestSingletonType1().createInstances();
		new TestSingletonType1().createMultiInstances();
		new TestSingletonType1().createMultiInstances1();
	}
	public void createInstances()
	{
		System.out.println("\n*********** SINGLE INSTANCES FROM SINGLETON ********\n");
		TestSingleton1 instance1 = TestSingleton1.getInstance();
		TestSingleton1 instance2 = TestSingleton1.getInstance();
		TestSingleton1 instance3 = TestSingleton1.getInstance();

		System.out.printf( "%-15s %-15s %n", "SERIAL NO", "INSTANCES");
		System.out.printf( "%-15s %-15s %n", "---------", "----------");

		System.out.format("%-15s %-15s %n", "INSTANCE 1 ",instance1);
		System.out.format("%-15s %-15s %n", "INSTANCE 2 ",instance2);
		System.out.format("%-15s %-15s %n", "INSTANCE 3 ",instance3);
	}
	public void createMultiInstances()
	{
		System.out.println("\n** MULTIPLE INSTANCES FROM SINGLETO **\n");
		/*
		 * Using Reflection you can break singleton
		 */
		try 
		{
			Class clazz = Class.forName("com.design.pattern.singleton.TestSingleton1");
			Constructor constructor = clazz.getDeclaredConstructors()[0];
			constructor.setAccessible(true);
			TestSingleton1 instance1 = (TestSingleton1)constructor.newInstance(null);
			TestSingleton1 instance2 = (TestSingleton1)constructor.newInstance(null);
			TestSingleton1 instance3 = (TestSingleton1)constructor.newInstance(null);

			System.out.printf( "%-15s %-15s %n", "SERIAL NO", "MULTI INSTANCES");
			System.out.printf( "%-15s %-15s %n", "---------", "---------------");

			System.out.format("%-15s %-15s %n", "INSTANCE 1 ",instance1);
			System.out.format("%-15s %-15s %n", "INSTANCE 2 ",instance2);
			System.out.format("%-15s %-15s %n", "INSTANCE 3 ",instance3);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void createMultiInstances1()
	{
		System.out.println("\n********* MULTIPLE INSTANCES FROM SINGLETON ********\n");
		/*
		 * Using Reflection you can break singleton
		 */
		try 
		{
			Class clazz = Class.forName("com.design.pattern.singleton.TestSingleton1");
			Method method = clazz.getDeclaredMethods()[0];
			Field field = clazz.getDeclaredFields()[0];
			field.setAccessible(true);

			TestSingleton1 instance1 = (TestSingleton1)method.invoke(clazz, null);
			field.set(clazz, null);
			TestSingleton1 instance2 = (TestSingleton1)method.invoke(clazz, null);
			field.set(clazz, null);
			TestSingleton1 instance3 = (TestSingleton1)method.invoke(clazz, null);

			System.out.printf( "%-15s %-15s %n", "SERIAL NO", "MULTI INSTANCES");
			System.out.printf( "%-15s %-15s %n", "---------", "---------------");

			System.out.format("%-15s %-15s %n", "INSTANCE 1 ",instance1);
			System.out.format("%-15s %-15s %n", "INSTANCE 2 ",instance2);
			System.out.format("%-15s %-15s %n", "INSTANCE 3 ",instance3);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
