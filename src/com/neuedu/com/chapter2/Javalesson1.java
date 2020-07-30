package com.neuedu.com.chapter2;

public class Javalesson1 {

	public static void main(String[] args) {
		// 基本数据类型中的整数
		//byte(1字节)，short(2字节)，int(4字节)，long(8字节)
		//-128~127
		//隐式转换
		byte a=127;
		//-2^15~2^15-1
		//隐式转换
		short b=-32768;
		//21474647
		//-2^31~2^31-1
		//隐式转换
		int c =21474647;
		//2^63~2^63-1
		//对于long型数据，如果超过int范围，需要在后面加L（大写）或l（小写），
		//由于小写l与数字1很像，所以推荐使用L
		long d=1231231231425345L;
		//隐式转换
		long d0=123;

	}

}
