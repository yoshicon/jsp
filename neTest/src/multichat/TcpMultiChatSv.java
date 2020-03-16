package multichat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TcpMultiChatSv {

	HashMap<String, DataOutputStream> clients;

	public TcpMultiChatSv() {
		super();
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}

	private void start() {
		ServerSocket serverSoc = null;
		Socket soc = null;

		try {
			serverSoc = new ServerSocket(7777);
			System.out.println("수박서버 가동");

			for (;;) {
				soc = serverSoc.accept();
				System.out.println("[ " + soc.getInetAddress() + " ]에서 접속");
				ServerReceiver thread = new ServerReceiver(soc);
				thread.start(); // thread.run 하면 스레드로는 실행 안됨
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void sendAll(String msg) {
		Set<String> mapset = clients.keySet();
		Iterator<String> iter = mapset.iterator();

		while (iter.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream) clients.get(iter.next());
				out.writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
	}
	
	class ServerReceiver extends Thread{
		Socket soc;
		DataInputStream in;
		DataOutputStream out;
		
		public ServerReceiver(Socket soc) {
			this.soc = soc;
			try {
				in = new DataInputStream(soc.getInputStream());
				out = new DataOutputStream(soc.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			String name ="";
			try {
				name = in.readUTF();
				sendAll("# " + name + "씨 입장");
				clients.put(name, out);
				System.out.println("접속자 수 : "+ clients.size());
				
				while(in != null) {
					sendAll(in.readUTF());
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				sendAll("# "+ name + "씨 퇴갤");
				clients.remove(name);
				System.out.println("[ " +soc.getInetAddress()+ " ] 에서 퇴갤함");
				System.out.println("접속자 수 : "+ clients.size());
			}
		}
	}
}
