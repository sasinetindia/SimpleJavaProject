package com.input;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	
	public static void main(String[] args) throws IOException {
		//writeFile();
		readFile();
	}
	
	
	public static void writeFile() throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\ew-ui.log");
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
		dataOutputStream.writeBytes("Hello");
	}
	
	
	public static void readFile() throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\ew-ui.log");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readUTF());
		
	}

}
