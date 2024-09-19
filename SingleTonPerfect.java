package com.design.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ReflectPermission;

import java.security.Permission;
public class SingleTonPerfect{
	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
		SingletonCheckAll s=SingletonCheckAll.getInstance();
		SingletonCheckAll s2=SingletonCheckAll.getInstance();
		System.out.println(s);
		System.out.println(s2);
		
		FileOutputStream fos =new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		
		FileInputStream fisa=new FileInputStream("ser");
		ObjectInputStream ois=new ObjectInputStream(fisa);
		SingletonCheckAll desi=(SingletonCheckAll)ois.readObject();
		System.out.println("------------------------");
		System.out.println("serilizable:"+s);
		System.out.println("deserilizable:"+desi);
		SingletonCheckAll s3=(SingletonCheckAll) s.clone();
		System.out.println("------------------------");

		System.out.println("original object:"+s);
		System.out.println("cloned object:"+s3);
		
		System.out.println("------------------------");
		try 
		{
		Class clazz = Class.forName("com.design.pattern.singleton.SingletonCheckAll");
		Method method = clazz.getDeclaredMethods()[1];
		System.out.println(method);
		Field field = clazz.getDeclaredFields()[0];
		System.out.println("field:"+field);

		field.setAccessible(true);
		
		SingletonCheckAll instance1 = (SingletonCheckAll)method.invoke(clazz, null);
		field.set(clazz, null);
		SingletonCheckAll instance2 = (SingletonCheckAll)method.invoke(clazz, null);
		field.set(clazz, null);
		SingletonCheckAll instance3 = (SingletonCheckAll)method.invoke(clazz, null);

		System.out.printf( "%-15s %-15s %n", "SERIAL NO", "MULTI INSTANCES");
		System.out.printf( "%-15s %-15s %n", "---------", "---------------");

		System.out.format("%-15s %-15s %n", "INSTANCE 1 ",instance1);
		System.out.format("%-15s %-15s %n", "INSTANCE 2 ",instance2);
		System.out.format("%-15s %-15s %n", "INSTANCE 3 ",instance3);
	}catch (Exception e) 
	{
		e.printStackTrace();
	}
	}

}
class SingletonCheckAll implements Serializable,Cloneable{
	private static volatile SingletonCheckAll instance=null;
	private SingletonCheckAll(){
		super();
		//Add the following piece of code so that it can not be invoked using relection
		/*System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkPermission(Permission perm) 
            {
            	if (perm instanceof ReflectPermission )
            	{
            		System.out.println("\nYes I will not allow you to create the instance using Reflection...\n");
            		throw new SecurityException();
            	}
            	else
            	{
            		//Do nothing
            	}
            }

        });*/
	}
	public static SingletonCheckAll getInstance(){
		if(instance==null){
			synchronized (SingletonCheckAll.class) {
				if(instance==null){
					instance =new SingletonCheckAll();
				}
			}
		}
		return instance;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		if(! (this instanceof Cloneable)){
			throw new CloneNotSupportedException(this.getClass().getName());
		}
		return instance;
	}
	private Object readResolve(){
		return instance;
		
	}
}