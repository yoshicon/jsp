package netex.s2;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UrlHead {
	public static void main(String[] args) throws IOException{
		URL url = new URL("https://tachibana.diskstation.eu:7000");
		URLConnection conn = url.openConnection();
		
		Map<String, List<String>> headerInfo = conn.getHeaderFields();

		Set<String> keyset = headerInfo.keySet();
		
		Iterator<String> it = keyset.iterator();

		while(it.hasNext()) {
			String hf = it.next();
			System.out.println("헤더 필드 : "+hf);
			System.out.println("필드에 있는거 : "+ headerInfo.get(hf));
		}
		System.out.println("\n\n");
	}
}
