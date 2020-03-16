package soket;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class TcpIpCl {

	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("172.0.0.1", 7777);
		InputStream ins = socket.getInputStream();
		DataInputStream dis = new DataInputStream(ins);
		System.out.println(dis.readUTF());
		dis.close();		
		socket.close();
	}
}
