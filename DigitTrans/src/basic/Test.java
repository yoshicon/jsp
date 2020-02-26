package basic;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		String data ="10";
//		int conData = 70;
//		// => 자료 명확성은 클라가 확인 +> 여기서도 2중으로 확인하면 금상천화
//		
//		if(data.indexOf('.') == -1)
//			data = data + ".";
//					
//		XdigitConDec dcx = new XdigitConDec();
//		double rtnVal = dcx.decimalCal(data, conData);
//		System.out.println(rtnVal);
		
		Scanner s = new Scanner(System.in);
		System.out.println("원본자료(숫자) 입력 : ");
		String sosData = s.next();
		System.out.println("원본은 몇진법인지 입력 : ");
		int sosRedix = s.nextInt();
		XdigitConDec obj = new XdigitConDec();
		double decNum = obj.decimalCal(sosData, sosRedix);
		System.out.println("몇진법으로 바꿀건지 입력 : ");
		int chgRedix = s.nextInt();
		
		String chgData="";
		DecimalConX lobj = new DecimalConX();
		chgData = lobj.intArea((int)decNum, chgRedix);
		chgData = chgData + "."+lobj.floatArea(decNum-(int)decNum, chgRedix);
		
		System.out.println(sosRedix+"진법 => "+sosData);
		System.out.println(chgRedix + "변환 결과 : "+chgData);
		s.close();
	}
}