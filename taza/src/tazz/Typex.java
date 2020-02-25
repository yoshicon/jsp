package tazz;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Typex {
	public static void main(String[] args) {
		StringBuilder readata = new StringBuilder();
		String filename = "lv3.txt";
		FileReader fr = null;
		int data = -1;
		try {
			fr = new FileReader(filename);
			while((data = fr.read()) != -1) {
				readata.append((char)data);
			}
		} catch (IOException e) {
			System.out.println("파일 못읽음");
			e.printStackTrace();
		}
		String[] words = readata.toString().split("\\n");	// 탭, 공백, 엔터키 다 \s로 구분 가능 \s+는 공백 중복되면 그것들도 다 무시
		int wordcnt = words.length;
		int truecnt = 0;
		Scanner s = new Scanner(System.in);
		int lp = 3;
		for (int i = 0; i < lp; i = i + 1) {
			int position = (int) (Math.random() * wordcnt);
			System.out.println(words[position]);
			String wordck = s.nextLine();	//////
			if(wordck.equals(words[position])) {
				System.out.println("이거 맛다");
				truecnt = truecnt + 1;
			}
		}
		
		System.out.println("맞은갯수 : " + truecnt);
		s.close();
	}
}
