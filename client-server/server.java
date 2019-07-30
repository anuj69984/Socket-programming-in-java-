import java.net.*;
import java.io.*;

public class server{
	 public static void main(String[] args) {
		try {
		//creating a server.  Ip address will be of system and given port number.
		ServerSocket server=new ServerSocket(3001); //port number;
		
		//Starting the server. Server starts waiting for a client request.
		Socket s=server.accept();
		System.out.println("client Connected");
		
		// Output stram
		// getOutputStream() provides ByteStream and DataOutputStream converts it to Stream
		// which can send float, int, string etc
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		dos.writeUTF("Message from server!");
		}catch(Exception e) {}
		
		
	}
}