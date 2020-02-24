package tazayon;

import java.io.FileInputStream;

public class FileRead {
	public static String FileRead(String babo) {
		try {
			String filePath = "D:\\HAK\\jsp\\taza\\src\\tazayon\\lv"+babo+".txt";

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

		String[] spl = babo.split("\\n");
		double rd = Math.random();
		int iv = (int) (rd * spl.length);
		return spl[iv];
	}
}
