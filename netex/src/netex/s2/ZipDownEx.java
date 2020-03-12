package netex.s2;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class ZipDownEx {

	public static void main(String[] args) throws Exception{
		int ch = 0;
		URL url = new URL("https://elsanna.000webhostapp.com/img/van.gif");
//		URL url = new URL("http://172.30.1.5:8888/netTest/testData.txt");
		InputStream inp = url.openStream();
		FileOutputStream out = new FileOutputStream("bao.txt");
		
		while( (ch = inp.read()) != -1) {
			out.write(ch);
		}
		inp.close();
		out.close();
	}

}
