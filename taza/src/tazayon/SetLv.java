package tazayon;

import java.util.Scanner;

public class SetLv {
	public SetLv() {
		System.out.println("난이도 설정 1 : 초급, 2 : 중급, 3 : 고급");
		Scanner s = new Scanner(System.in);
		String babo = s.next();	// 난이도 입력
		FileRead.FileRead(babo);
		s.close();
	}
}
