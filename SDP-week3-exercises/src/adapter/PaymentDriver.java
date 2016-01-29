package adapter;

public class PaymentDriver {

	public static void main(String[] args) {
		Xpay ex = new XpayImpl("87456359", "W Buffet", "05", "2017", (short) 111, 126.43);
		System.out.println(ex.toString());

	}

}
