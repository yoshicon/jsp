package bigNum;

import java.util.Scanner;

public class DoubleBigAdd {
	public static void main(String[] args) {
		int[] inArr = {1, 2};
		String[] inString = new String[inArr.length];
		int[] inStringLength = new int[inArr.length];
		
		for(int s=0; s<inArr.length; s++) {
			inString[s] = inData(inArr[s]);
			inStringLength[s] = inString.length;
		}
		
		int arrCnt = (inStringLength[1] > inStringLength[2]) ? inStringLength[1]+1 : inStringLength[2]+1;
		
		int[] carry = new int[arrCnt];	// 올림수 저장용
		int[] no1 = arrayNumTran(inStringLength[1], arrCnt, inString[1]);	// 첫번째 수 저장용
		int[] no2 = arrayNumTran(inStringLength[2], arrCnt, inString[2]);	// 두번째 수 저장용
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
	
	static private String inData(int numb) {
		String rtVal = null;
		Scanner s = new Scanner(System.in);
		System.out.println(numb + "번째 수 입력");
		rtVal = s.next();
		s.close();
		return rtVal;
	}

}
