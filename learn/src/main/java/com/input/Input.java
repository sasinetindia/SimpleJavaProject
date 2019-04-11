package com.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input {
	
	public static void main(String[] args) throws IOException {
		
		readWithSystemin();
		
	}
	
	
	public static String readWithBufferReader() throws IOException {
		// Inputstream reader is the reader we need to use for getting input stream
		// Here construction parameter System.in tells that we are getting input from
		// keyboard
		// We can pass file also when reading from file.
		InputStreamReader isr = new InputStreamReader(System.in);

		// Buffered reader should be used to read data from Keyboard/File,etc
		BufferedReader bufferedReader = new BufferedReader(isr);
		return bufferedReader.readLine();
	}
	
	
	public static void readWithSystemin() throws IOException {
		
		//It will get as ACSII value
		int i = System.in.read();
		
		//When we print the value, It will print the ascii value
		System.out.println(i);
				
	}
	
}
 