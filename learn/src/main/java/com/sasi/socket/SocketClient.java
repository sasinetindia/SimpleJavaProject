package com.sasi.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",9999);
		
		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
		
		PrintWriter out = new PrintWriter(osw);
		
		out.write("Sasi");
		
		//Client will wait for 512 byte of data to be sent so will forcely flush
		out.flush();
		
		
		//Receive the response from the server
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String input = br.readLine();
		System.out.println("Server Response received :"+input);
	}

}
