package basic;

public class DecimalConX {
	String digitStr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz가나다라마바사아자차카타파하";

	public String intArea(int numberData, int converDigit) { // 정수부분 변환
		String result = "";
		int mok = 0;
		while (true) {
			result = digitStr.charAt(numberData % converDigit)+result;
			mok = numberData / converDigit;
			if (mok <= 0)
				break;
		}
		
		numberData = mok;		
		return result;
	}
	
	
	public String floatArea(double numberData, int converDigit) { // 소수부분 변환  / 6자리 까지만
		String result = "";
		double multiVal = 0.0;
		for (int q=0; q<6; q++) {	//
			multiVal = numberData * converDigit;
			int intVal = (int)multiVal;
			result = result + digitStr.charAt(intVal);
			numberData = multiVal - intVal;
			if (numberData <= 0.0)
				break;
		}
		return result;
	}
}