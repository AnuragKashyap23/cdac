package com.sunbeam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the className : ");
		String className = sc.next(); 
		
		Class<?> c = Class.forName(className); 
		
		System.out.println("Name : "+c.getName());
		System.out.println("Super-class-Name : "+c.getSuperclass());
		
		Field[] fields = c.getDeclaredFields(); 
		for (Field field : fields) {
			System.out.println("Fields : "+field.toString());
		}
		
		Method[] methods = c.getDeclaredMethods(); 
		for (Method method : methods) {
			System.out.println(method);
		}
		
		Constructor<?>[] ctors = c.getDeclaredConstructors(); 
		for (Constructor<?> ctor : ctors) {
			System.out.println("Constructors : "+ctor.toString());
		}
		
		Class<?>[] intfs = c.getInterfaces(); 
		for (Class<?> intf : intfs) {
			System.out.println("Interfaces : "+intf.getName());
		}
	}

}
