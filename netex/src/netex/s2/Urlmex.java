package netex.s2;

import java.net.URL;

public class Urlmex {
	public static void main(String[] args) throws Exception{
		URL url = new URL("https://babo@tachibana.diskstation.eu:7000/fbdownload/A7III%20DERE.png");
		System.out.println("getAuthority : " + url.getAuthority());
		System.out.println(" getDefaultPort : " + url.getDefaultPort());
		System.out.println(" getPort : " + url.getPort());
		System.out.println(" getFile : " + url.getFile());
		System.out.println(" getHost : " + url.getHost());
		System.out.println(" getPath : " + url.getPath());
		System.out.println(" getProtocol : " + url.getProtocol());
		System.out.println(" getQuery : " + url.getQuery());
		System.out.println(" getRef : " + url.getRef());
		System.out.println(" getUserInfo: " + url.getUserInfo());
		System.out.println(" toExternalForm : " + url.toExternalForm());
		System.out.println(" toURI : " + url.toURI());
		System.out.println(" toString : " + url.toString());
		System.out.println("----------------------------------------------");
		System.out.println(" getContent : " + url.getContent());
	}
}
