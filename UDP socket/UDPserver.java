// UDP socket in java
import java.net.*;
import java.io.*;
/**
 * @author Anuj2.Kumar
 */

public class UDPserver{
	public static void main(String[] args)  throws Exception {
		DatagramSocket ds= new DatagramSocket(2001); // 2001- port on which client is sending the data
		
		//creating an empty byte array to recv packet
		byte b[]=new byte[100];
				
		//creating empty datagram packet which takes 2 arguments
		// DatagramPacket(data_to_be_recv,size);
		DatagramPacket dp=new DatagramPacket(b,b.length);
		ds.receive(dp);// will recv msg in dp
		
		//converting byte array to string
		String msg=new String(b);
		System.out.println("Received msg by server: " + msg);
	}
}