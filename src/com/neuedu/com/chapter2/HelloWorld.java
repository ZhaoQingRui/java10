package com.neuedu.com.chapter2;
/*
 * 1.一个。class文件可以有多个class，但是只允许有一个public修饰的
 * 文件名与public一样
 * 2.只有public类中才能有main入口方法
 * 3.如果文件中没有public类，文件名要跟其中一个类的名相同
 * */
public class HelloWorld 
{
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello China");
	}
}
class TestJava{
	public static void main(String[] args) {
		System.out.println("xxx");
	}
}
