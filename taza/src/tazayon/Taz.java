package tazayon;

import java.io.FileInputStream;
import java.util.Scanner;

public class Taz {
	static String[] testex;
	static String tmp="";
	public static void main(String[] args) {
		System.out.println("타자연습 프로그램 시작");

		// 난이도 설정 
		System.out.println("난이도 설정 1 : 초급, 2 : 중급, 3 : 고급");
		Scanner s = new Scanner(System.in);
		String levle = s.next();
		
		// 난이도에 맞는 파일 가져오기
		try {
			String filePath = "D:\\HAK\\jsp\\taza\\src\\tazayon\\lv"+levle+".txt";

			FileInputStream fileStream = null;

			fileStream = new FileInputStream(filePath);
			byte[] readBuffer = new byte[fileStream.available()];
			while (fileStream.read(readBuffer) != -1) {
			}
			testex = new String(readBuffer).split("\\n");
			// testex에 파일 split 하면서 넣어줌
			tmp += new String(readBuffer);
			fileStream.close();
		} catch (Exception e) {
			System.out.println("파일 출력 실패");
			e.getStackTrace();
		}
		//testex = tmp.split(", ");
		
		// 파일 가져오고 split해서 배열같은데에 넣어줌
		
		// 그 배열에서 몇개 랜덤으로 출력
		
		// 출력 문구랑 입력받은거 같은지 비교
		int ed = testex.length;
		for(int q=0; q<ed ;q++) {
			System.out.println(testex[q]);
		}
		
		s.close();
	}

}
