package babo;

import java.util.Scanner;

import common.AccWorkProce;
import common.InsaWorkProce;
import common.IpCheck;
import common.Ipinput;
import common.JajaWorkProce;
import common.workProce;

public class NetIpck {

	public static void main(String[] args) {
		int cl[] = new int[4];
		Ipinput ipn = new Ipinput();
		String[] data = ipn.inputIp();
		
		for(int q=0; q<cl.length; q++) { // for문에 앵간하면  @@.length 하지 마 => int endnum = cl.length해주고 쓰자
			cl[q] = Integer.parseInt(data[q]);
		}
		
		IpCheck obj = new IpCheck();
		boolean result = obj.netck(cl);
		
		workProce proc = null;	// 인터페이스
		System.out.println("작업을 선택 1 : 인사, 2 : 자재관리, 3 : 회계관리");
		Scanner s = new Scanner(System.in);
		int js = s.nextInt();
		
		switch (js) {
		case 1: proc = new InsaWorkProce();	break;
		case 2:	proc = new JajaWorkProce();	break;
		case 3:	proc = new AccWorkProce(); break;
		default: break;
		}
		
		if(proc != null)proc.job(result);
		else System.out.println("없는 작업이니까 종료함");

		obj = null;
	}
}
