package com.sasi.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) throws IOException {
		System.out.println("Server Started");
		ServerSocket sc = new ServerSocket(9999);
		System.out.println("Server waiting for client connection");
		
		//Will Create a socket for the client
		Socket ss = sc.accept();
		System.out.println("Client connected");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
		String input = br.readLine();
		System.out.println("Client request received :"+input);
		
		
		OutputStreamWriter osw = new OutputStreamWriter(ss.getOutputStream());

		PrintWriter out = new PrintWriter(osw);

		out.write(input.substring(0,3));

	}

}
