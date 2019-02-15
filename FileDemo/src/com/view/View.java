package com.view;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import com.utils.FileUtils;

public class View {
	private static Scanner in = new Scanner(System.in);

	public static void show() throws IOException {
		System.out.println("欢迎使用加解密工具");
		System.out.println("1:加密2:解密");
		int action=in.nextInt();
		action(action);
	}

	private static void action(int action) throws IOException {
		switch (action) {
		case 1:
			System.out.println("准备加密");
			System.out.println("请输入密钥");
			int key = in.nextInt();
			String path = FileUtils.encrypt(key);
			System.out.println("加密后的文件路径" + path);
			break;
		case 2:
			System.out.println("准备解密");
			System.out.println("请输入密钥");
			key = in.nextInt();
			path = FileUtils.deciphering(key);
			System.out.println("解密后的文件路径" + path);
			break;
		default:
			break;
		}
	}
}
