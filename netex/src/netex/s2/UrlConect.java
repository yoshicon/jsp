package netex.s2;

import java.net.URL;
import java.net.URLConnection;

public class UrlConect {
	public static void main(String[] args) throws Exception {
//		URLConnection conn = new URLConnection() {
//			
//			@Override
//			public void connect() throws IOException {
//				
//			}
//		};
		
		URL url = new URL("https://idolmaster:283@tachibana.diskstation.eu:7000/");
		URLConnection conn = url.openConnection();
		System.out.println(conn);
		System.out.println("getAllowUserInteraction : "+conn.getAllowUserInteraction());
		System.out.println("getConnectTimeout : "+conn.getConnectTimeout());
		System.out.println("getContentEncoding : "+conn.getContentEncoding());
		System.out.println("getContentLength : "+conn.getContentLength());
		System.out.println("getContentType : "+conn.getContentType());
		System.out.println("getContent : "+conn.getContent());
		System.out.println("getDate : "+conn.getDate());
	}
}
