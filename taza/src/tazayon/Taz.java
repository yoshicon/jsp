package tazayon;

import java.io.FileInputStream;
import java.util.Scanner;

public class Taz {
	static String[] testex;
	public static void main(String[] args) {
		System.out.println("타자연습 프로그램 시작");

		// 난이도 설정 
		System.out.println("난이도 설정 1 : 초급, 2 : 중급, 3 : 고급");
		Scanner s = new Scanner(System.in);
		String levle = s.next();
		int sm = 0;
		
		// 난이도에 맞는 파일 가져오기
		try {
			//String filePath = "D:\\HAK\\jsp\\taza\\src\\tazayon\\lv"+levle+".txt";
			String filePath = "lv"+levle+".txt";
			
			FileInputStream fileStream = null;

			fileStream = new FileInputStream(filePath);
			byte[] readBuffer = new byte[fileStream.available()];
			while (fileStream.read(readBuffer) != -1) {
			}
			testex = new String(readBuffer).split("\\n+");
			// testex에 파일 split 하면서 넣어줌
			fileStream.close();
		} catch (Exception e) {
			System.out.println("파일 출력 실패");
			e.getStackTrace();
		}
		
		// 파일 가져오고 split해서 배열같은데에 넣어줌 - 여기까지 성공
		
		// 그 배열에서 몇개 랜덤으로 출력 - 성공
		// 몇번 반복시키기
		int lp = 3;//testex.length;
		for (int q = 0; q < lp; q++) {
			double rd = Math.random();
			int iv = (int) (rd * testex.length);
/*/		
			// 출력 문구랑 입력받은거 같은지 비교
			System.out.println(testex[iv]);
			ck = s.nextLine();
			if (ck.equals(testex[iv])) {
				sm = sm + 5;
				System.out.println("정답! 점수 : " + sm + "점!");
			} else
				System.out.println("땡");
			
//*/	
		}
		
			System.out.println(sm);

//*/		배열 출력 확인
			for (int d = 0; d < testex.length; d++) {
				System.out.println(testex[d]);
			}
//*/	
			s.close();
		}

}
