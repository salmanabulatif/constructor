package constructors1;

public class Main {

	public static void main(String[] args) {
		Mobile mobile1=new Mobile();
		mobile1.setBrand("sms");
		System.out.println(mobile1.getBrand());
		mobile1.dialNumber("07913231");
		mobile1.getCall("salman");
		Mobile.answerCall(true);
		Mobile mobile2=new Mobile("sss", "white", 2022);
	}

}
