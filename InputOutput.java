package com.ofiice.ex;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		
		/* 
		 * 1. 데이터 출력 system.our.println()  ln => line 
		 */
		
		int num = 1000; 
		System.out.println(100);
		
		String str = "Hello";
		System.out.println(str);
		
		System.out.println(10 + 20);  //Hello 20
		int num1 = 20; 
		System.out.println("Hello" + num1); // Hello 20 
		
		System.out.println("abc");
		System.out.println(" ");
		System.out.println("def");       //abc def
		System.out.println("\n");
		System.out.println("ghi");
		
		/*
		 * 특수 문자 
		 * \n :개행 
		 * \t : 탭 
		 * \' : '
		 * \" : "
		 * \\ : \
		 */
		 
		 
		 System.out.println("이름\t학번\n");
		 System.out.println("Mr.H\t2020_000123\n");
		 System.out.println("Mr.k\t2020_000124\n");
		 
		 System.out.println("어머님께서는 \"밥 먹고 설거지 해놔라.\" 라고 하셨습니다.\n");
		 System.out.println("그래서 나는 \'네.\' 라고 했습니다.\n");
		 		
		 System.out.println("\\\\\\\\\\\\\\\\\\\\");
		 System.out.println("\\\\2026-11-26\\\\");
		 
		 /*
		  * 2. 데이터 입력 SCanner 
		  */
		 
		 Scanner scanner = new Scanner(System.in);
		 String str1 = scanner.nextLine(); //abcde
		 System.out.println("str1: " + str1);
		 
		 /*
		  * nextByte(): 정수(byte) 입력 
		  * nextInt():  정수(Long) 입력 
		  * nextLong(): 실수(float) 입력 
		  * nextFloat():실수(Double) 입력 
		  * nextDouble():문자열(string) 입력 
		  * nextBoolean():논리(Boolean) 입력    
		  */
		 
		 byte byteNum = scanner.nextByte();
		 System.out.println("byteNum: " + byteNum);
		 
		 int IntNum = scanner.nextInt();
		 System.out.println("IntNum: " + IntNum);
		 
		 long longNum = scanner.nextLong();
		 System.out.println("longNum: " + longNum);
		 
		 Float floatNum = scanner.nextFloat();
		 System.out.println("floatNum: " + floatNum);
		 
		 boolean  booleanData = scanner.nextBoolean();
		 System.out.println("BooleanData: " + booleanData);
		 
		 
		 scanner.close();
		 
		 
		 
	}
	
}
