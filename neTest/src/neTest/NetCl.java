package neTest;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class NetCl {
	public static void main(String[] args) throws Exception{
		Socket soc = new Socket("localhost", 6666);
		InputStream is = soc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		String readata = dis.readUTF();
		System.out.println("서버에서 받은거 : "+readata);
		
		dis.close();
		soc.close();
		is.close();
	}
}
