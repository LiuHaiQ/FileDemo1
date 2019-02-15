package com.test;

import java.io.IOException;
import java.util.Scanner;

import com.view.View;

public class Test {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		try {
			do {
				View.show();
				System.out.println("童鞋还需要加密吗?(1:需要2:不需要)");
				int action=in.nextInt();
				if (action==2) {
					break;
				}
			} while (true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("你可能还没加密哦");
		}
	}
}
