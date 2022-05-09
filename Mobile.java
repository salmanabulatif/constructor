package constructors1;

public class Mobile {
	private static String brand;
	private String color;
	private int year;
	public Mobile() {
		System.out.println("mobile object created");
	}
	
	public Mobile(String brand,String color,int year) {
		this.brand=brand;
		this.color=color;
		this.year=year;
		System.out.println("second type of constructors");
	}

	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void dialNumber(String phonenumber){
		System.out.println("dialing "+ phonenumber);
	}
	
	public void getCall(String callername ){
		System.out.println(callername+ "is calling");
	}
	public static void answerCall(boolean isanswered) {
		if(isanswered) {
			System.out.println("call answered " + brand);
		} else {
			System.out.println("missed call");
		}
	}
}
