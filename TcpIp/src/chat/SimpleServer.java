package chat;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleServer extends Thread implements ActionListener{
	Frame frame;
	TextArea ta;
	TextField tf;
	ServerSocket s;
	Socket s1;
	DataOutputStream dos;
	DataInputStream dis;
	boolean stop;

	public SimpleServer(){
		launchFrame();
		service();
	}

	private void launchFrame(){
		frame  = new Frame("일대일 채팅 실습");
		ta = new TextArea();
		tf = new TextField();
		frame.setBackground(Color.lightGray);
		ta.setEditable(false);
		
		frame.add(ta, BorderLayout.CENTER);
		frame.add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);

		frame.setSize(500, 300);
		frame.setVisible(true);
		tf.requestFocus();
	}

	private void service(){
		try{
			ta.append("서비스 준비중...\n");
			s= new ServerSocket(5430);
			ta.append("클라이언트 접속 대기중...");
			s1 = s.accept();
			ta.append("클라이언트가 접속하였습니다. : "+s1.getInetAddress()+'\n');

			 dos= new DataOutputStream(s1.getOutputStream());
			 dis= new DataInputStream(s1.getInputStream());
			 this.start();
	        dos.writeUTF("채팅 서버에 접속하신 걸 환영합니다..!!");
		}catch(IOException io){
			io.printStackTrace();
		}
	}

	public static void main(String args[]){
		new SimpleServer();
	}

	public void actionPerformed(ActionEvent action){
		try{
			String msg = tf.getText();
			ta.append(msg+'\n');
			if(msg.equals("exit")){
				ta.append("bye");
				stop=true;
				dos.close();
				s1.close();
				System.exit(0);
			}else{
				dos.writeUTF("서버 :"+msg);
				tf.setText("");
			}
		}catch(IOException io){
			ta.append(io.toString()+'\n');
		}
	}

	public void run(){
		try{
			while(!stop){
				ta.append(dis.readUTF()+'\n');
			}
	        dis.close();
	        s1.close();
		}catch(EOFException eof){
			ta.append("클라이언트로 부터 연결이 끊어졌습니다.\n ");
		}catch(IOException io){
			io.printStackTrace();
		}
	}
}
