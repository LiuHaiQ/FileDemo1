package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {
	private static int encryptKey;
	// 加密的key
	private static int decipheringKey;
	//解密的key
	public static String encrypt(int key) throws IOException {
		// 接收密钥
		// 加密
		encryptKey=key;
		//设置key
		File file = new File("src/原文件.png");
		File file2 = new File("src/加密.png");
		FileInputStream inputStream = new FileInputStream(file);
		// 读文件
		FileOutputStream outputStream = new FileOutputStream(file2);
		// 写文件
		int number;
		while ((number = inputStream.read()) != -1) {
			outputStream.write(number ^ key);
			// 加密

		}
		String path = file2.getAbsolutePath();
		// 返回加密后的文件路径
		outputStream.close();
		inputStream.close();
		return path;

	}

	public static String deciphering(int key) throws IOException {
		// 接收密钥
		// 解密
		decipheringKey=key;
		//设置key
		File file = new File("src/加密.png");
		FileInputStream inputStream = new FileInputStream(file);
		// 读文件
		File file2 = new File("src/解密后.png");
		FileOutputStream outputStream = new FileOutputStream(file2);
		// 写文件
		int number;
		while ((number = inputStream.read()) != -1) {
			outputStream.write(key^number);
			// 解密
		}
		String path = file2.getAbsolutePath();
		// 返回路径
		if (encryptKey==decipheringKey) {
			System.out.println("解密成功");
		}else {
			System.out.println("解密失败");
		}
		outputStream.close();
		inputStream.close();
		return path;
	}

}
