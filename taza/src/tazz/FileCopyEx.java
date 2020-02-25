package tazz;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx {
	public static void main(String[] args) throws Exception {
		FileInputStream fr = new FileInputStream("diz.jpg");
		FileOutputStream fw = new FileOutputStream("dizn.jpg");
//		long stm = System.nanoTime();
		
		byte[] readata = new byte[1024];
		int k = 0;
		while((k = fr.read(readata))!=-1) {
			fw.write(readata, 0, k);
		}
//		System.out.println("복사 시간 : "+(System.nanoTime()-stm));
		fr.close();
		fw.close();
		System.out.println("복사 끝");
	}
}
