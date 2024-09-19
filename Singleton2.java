package com.design.pattern.singleton;

import java.lang.reflect.ReflectPermission;
import java.security.Permission;

public class Singleton2 {
	public static void main(String[] args) {
		Singleton2 s=Singleton2.getInstance();
		System.out.println(s);
	}
	private static Singleton2 instance =null;
	
	private Singleton2(){
		super();
		//Add the following piece of code so that it can not be invoked using relection
		System.setSecurityManager(new SecurityManager() {
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

        });
	}
	public static Singleton2 getInstance(){
		if(instance==null){
			synchronized (Singleton2.class) {
				instance =new Singleton2();
			}
		}
		return instance;
	}
}
