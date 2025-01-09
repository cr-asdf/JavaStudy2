package com.winter.app.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudyException1 {
	
	
	
	public void m1(Scanner sc) throws Exception {
		System.out.println("숫자를 입력하세요");
		
		// throw new InputMismatchException();
		int num = sc.nextInt();
			
		// throw new ArithmeticException();
		num = 20/num;
		System.out.println(num);
		
		
//		catch(InputMismatchException ex) {
//			System.out.println("정수만 입력하세요");
//		}catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없다");
//		}
		
		
	}

}
