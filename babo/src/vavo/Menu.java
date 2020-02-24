package vavo;

import java.io.FileInputStream;

public class Menu {
	public static String Menu(String babo) {
		try {
			String filePath = "D:\\HAK\\jsp\\babo\\src\\vavo\\bob.txt";
			//String filePath = "https://elsanna.000webhostapp.com/etc/bob.txt";

			FileInputStream fileStream = null;

			fileStream = new FileInputStream(filePath);
			byte[] readBuffer = new byte[fileStream.available()];
			while (fileStream.read(readBuffer) != -1) {
			}
			babo += new String(readBuffer);

			fileStream.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

		String[] spl = babo.split(", ");
		double rd = Math.random();
		int iv = (int) (rd * spl.length);
		return spl[iv];
	}
}