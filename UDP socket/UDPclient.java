// UDP socket in java
import java.net.*;
import java.io.*;
/**
 * @author Anuj2.Kumar
 */

public class UDPclient {
	public static void main(String[] args)  throws Exception{
		DatagramSocket ds= new DatagramSocket();
		byte b[]="My name is Anuj. Sending this msg by client".getBytes();
		
		//assigning ip and port
		InetAddress ip=InetAddress.getByName("localhost");
		int port=2001;
		
		//creating datagram packet which takes 4 arguments
		// DatagramPacket(data_to_be_sent,size,ip_destination,port_destination);
		DatagramPacket dp=new DatagramPacket(b,b.length,ip,port);
		ds.send(dp);
	}
}