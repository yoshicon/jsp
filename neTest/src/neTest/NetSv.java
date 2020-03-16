package neTest;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetSv {
	public static void main(String[] args) {
		ServerSocket Ss;
		OutputStream ops = null;
		DataOutputStream dos = null;
		try {
			Ss = new ServerSocket();
			Ss.bind(new InetSocketAddress("127.0.0.1",6666));
			
			System.out.println("연결 대기중");
			Socket sc = Ss.accept();
			String msg = sc.getInetAddress().toString();
			
			ops = sc.getOutputStream();
			dos = new DataOutputStream(ops);
			dos.writeUTF(msg+"에서 접속");

			System.out.println("연결 성공");

			

			dos.close();
			sc.close();
			System.out.println("연결 종료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
