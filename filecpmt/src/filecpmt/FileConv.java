package filecpmt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileConv {
	public static void main(String[] args) throws IOException {
		if(args.length < 2) {
			System.out.println("파일 인자 부족");
			System.exit(1);
		}
		
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		int[] wData = new int[10];
		int readata = 0;
		Random ran = new Random();
		while((readata = fis.read()) != -1) {
			for(int q=0; q<wData.length; q++) {	//쓰레기 주입
				wData[q] = ran.nextInt(12721485);
			}
			wData[0] = ran.nextInt(127);	// 0번방에 연산되는 숫자 삽입
			wData[1] = ran.nextInt(wData.length-2)+2;	// 실제 데이터가 저장될 위치
			wData[wData[1]] = readata + wData[0];
			
			for(int w=0; w<10; w++) {
				fos.write(wData[w]);
			}
		}	
		
		fos.close();
		fis.close();
	}
}
