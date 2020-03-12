package soket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpSv {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "서버 준비 끝");
		} catch (IOException e) {
			e.printStackTrace();
		}
		while(true) {
			try {
				System.out.println(getTime() + "연결 요청 대기");
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + "랑 연결댐");
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				dos.writeUTF("પ નુલુગ લસશ");
				
				dos.close();
				socket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
