package basic;

public class XdigitConDec {
	String digitStr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz가나다라마바사아자차카타파하";
//					   1234567890123456789012345678901234567890123456789012345678901234567890123456789

	public double decimalCal(String numData, int digitinfo) {
		
		int pointPosition = numData.indexOf('.');
		numData = numData.substring(0, pointPosition)+numData.substring(pointPosition+1);
		int dataSize = numData.length();
		double resultNum = 0;
		int fk = 0;
		for(int q=dataSize-1; q>=0 ; q--) {
			fk += 1;
			char tmp = numData.charAt(dataSize-1-q);
			int calValue = digitStr.indexOf(tmp);
			resultNum = resultNum + calValue * Math.pow(digitinfo, pointPosition-fk);
		}
		return resultNum;
	}
}
	
//	private static int checkPoint(String data) {
//		int point = -72;
//		point = data.indexOf('.');
//		return point;
//	}
//	
//	private static String pointDelData(String data) {
//		int pos = checkPoint(data);
//		String rtnVal = data.substring(0, pos)+data.substring(pos+1);
//		return rtnVal;
//	}