package basic;

public class Test {
	public static void main(String[] args) {
		String data ="12F";
		int conData = 16;
		
		if(data.indexOf('.') == -1)
			data = data + ".";
					
		XdigitConDec dcx = new XdigitConDec();
		double rtnVal = dcx.decimalCal(data, conData);
		System.out.println(rtnVal);

	}
}