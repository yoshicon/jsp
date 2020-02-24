package common;

public class IpCheck {
	int serverIp[] = {192,168,0,189}; // 지금 서버 시스템의 아이피 주소를 구함(가정 192.168.0.189)
	int[] subNetMask = {255,255,255,0};

	public boolean netck(int[] cli) {
		int[] subsr = iprs(serverIp); 
		int[] clirs = iprs(cli);

		boolean rs = true;
		for(int q=0; q<clirs.length; q++) {
			if(clirs[q] != subsr[q]) {
				rs = false;
				break;
			}
		}
		return rs;
	}
	
	private int[] iprs(int[] ck) {
		int[] result = new int[ck.length];
		
		for(int q=0; q<ck.length; q++) {
			result[q] = subNetMask[q] & ck[q];
		}
		return result;
	}
}
