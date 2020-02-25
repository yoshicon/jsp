package bigNum;

import java.util.Scanner;

public class BigAdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		String firstNum = s.next();
		int fistLen = firstNum.length();
		System.out.println("두번째 수 입력");
		String secondNum = s.next();		
		int secondLen = secondNum.length();
		
		int arrCnt = (fistLen > secondLen) ? fistLen+1 : secondLen+1;
		
		int[] carry = new int[arrCnt];	// 올림수 저장용
		int[] no1 = arrayNumTran(fistLen, arrCnt, firstNum);	// 첫번째 수 저장용
		int[] no2 = arrayNumTran(secondLen, arrCnt, secondNum);	// 두번째 수 저장용
		int[] result = new int[arrCnt];	// 결과값 저장용
		
		int midNum = 0;
		for(int q=arrCnt-1 ; q>0 ; q--) {
			midNum = carry[q] + no1[q] + no2[q];
			result[q] = midNum%10;
			carry[q-1] = midNum/10;
		}
		result[0] = carry[0];
		for(int w=0; w< arrCnt; w++)
			System.out.print("" + result[w]);
		s.close();
	}
	
	static private int[] arrayNumTran(int numLen, int arrLen, String data) {
		int[] returNum = new int[arrLen];
		int a = 0;
		for(int q=arrLen-numLen ; q<arrLen ; q++) {
			returNum[q] = data.charAt(a)-'0';
			a = a+1;
		}
		return returNum;
	}
}
