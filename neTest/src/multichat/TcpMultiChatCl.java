package multichat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatCl {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("대화명 입력");
			System.exit(1);
		}
		String nick = args[0];
		try {
			String serverIp = "172.30.1.1";
			Socket socket = new Socket(serverIp, 7777);
			System.out.println("수박서버 접속 완료");
			Thread thread = new Thread(new ClientSender(socket, nick));
			Thread reciver = new Thread(new CliensReciver(socket));

			thread.start();
			reciver.start();
		} catch (ConnectException e) {
		} catch (Exception e) {
		}
	}

	static class ClientSender extends Thread {
		Socket socket;
		String nick;
		DataOutputStream out;

		public ClientSender(Socket socket, String nick) {
			super();
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.nick = nick;
			} catch (Exception e) {
			}
		}

		@Override
		public void run() {
			Scanner s = new Scanner(System.in);
			try {
				if (out != null) {
					out.writeUTF(nick);
				}
				while (out != null) {
					out.writeUTF("[ " + nick + " ]");
				}
			} catch (IOException e) {
			}
			s.close();
		}
	}

	static class CliensReciver extends Thread {

		Socket socket;
		DataInputStream in;

		public CliensReciver(Socket socket) {

			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {}

		}

		@Override
		public void run() {
			while (in != null) {
				try {
					System.out.println(in.readUTF());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}
}
