import java.net.*;
import java.io.*;

/**
 * @author Anuj2.Kumar
 */
class portScanner{
	public static void main(String[] args) {
		Socket s;
		for(int i=0;i<65536;i++) {
			try {
			s=new Socket(args[0],i);
			System.out.println("PORT OPEN : " + i);
			}catch(Exception e) {}
		}
		//run it using (in the current Directory): java -cp ./ portScanner 127.0.0.1
		//it will display all the available port on this IP
	}
}