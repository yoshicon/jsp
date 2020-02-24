package common;

import java.util.Scanner;

public class Ipinput {
	public String[] inputIp() {
		Scanner s = new Scanner(System.in);
		System.out.println("ip 입력");
//		while() 입력된 문자열에서 .이 3개인동안
		
		String[] ipDiv = s.next().split("\\.");
		s.close();
		return ipDiv;
	}
}
