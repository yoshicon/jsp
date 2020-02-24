package babo;

import common.IpCheck;

public class NetIpck {

	public static void main(String[] args) {

		int cl1[] = {192,168,0,127};
		int cl2[] = {192,168,72,48};
		IpCheck obj = new IpCheck();
		System.out.println("접속상태 : "+obj.netck(cl1));
		System.out.println("접속상태 : "+obj.netck(cl2));
	}
}
