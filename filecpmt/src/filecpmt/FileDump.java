package filecpmt;

import java.io.FileInputStream;
// 파일 내용을 16진수로 출력
public class FileDump {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("diz.jpg");
		byte[] inData = new byte[10];
		int k = -72;
		while((k = fis.read(inData)) != -1) {
			for(int q=0; q<k; q++) {
				System.out.printf("%02x ", inData[q]);
			}
			System.out.println();
			
		}
		fis.close();
	}
}
