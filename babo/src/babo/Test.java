package babo;

import java.util.Scanner;

// 1-2+3-4+5...n
public class Test {
	public static void main(String[] args) {
		System.out.println("숫자 입력");
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int sm=0, k = -1;
		
//		for(int q=1; q<=t; q++) {
//			if(q%2!=0)
//				sm+=q;
//			else sm-=q;
//		}
		
//		for(int q=1; q<=t; q=i+2) {
//			os = os+i;
//			es = es+(i+1);
//		}
//		es = es-(t+1)
		
		for(int q=1; q<=t; q++){
			k = k* -1;
			sm = sm+k*q;
		}
		
		System.out.println(sm);
		s.close();
	}
}