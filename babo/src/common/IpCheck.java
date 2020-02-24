package common;

public class IpCheck {


	public boolean netck(int[] cli) {
		int[] subsr = iprs(IpInfo.serverIp); 
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
			result[q] = IpInfo.subNetMask[q] & ck[q];
		}
		return result;
	}
}
