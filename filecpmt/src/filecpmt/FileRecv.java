package filecpmt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
// 파일 복호화
public class FileRecv {
	public static void main(String[] args) throws Exception {
		if(args.length < 2) {
			System.out.println("파일 인자 부족");
			System.exit(1);
		}
		
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		byte[] wData = new byte[10];
		int readcnt = 0;

		while((readcnt = fis.read(wData)) != -1) {
			int arisVal = wData[0];
			int realPosition = wData[1];
			int realData = wData[realPosition]-arisVal;
			fos.write(realData);
		}	
		
		fos.close();
		fis.close();
	}
}
