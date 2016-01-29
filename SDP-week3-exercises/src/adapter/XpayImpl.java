package adapter;

// Using boilerplate until I can get Lombok to work in my Eclipse!

public class XpayImpl implements Xpay {
	// plug in the new adapter
	private XpayToPayDAdapter adap;
	
	private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;
    
    public XpayImpl(String creditCardNo, String customerName, String cardExpMonth, String cardExpYear, Short cardCVVNo,
			Double amount) {
		this.creditCardNo = creditCardNo;
		this.customerName = customerName;
		this.cardExpMonth = cardExpMonth;
		this.cardExpYear = cardExpYear;
		this.cardCVVNo = cardCVVNo;
		this.amount = amount;
		
		// Use the new adapter
		adap = new XpayToPayDAdapter(this);
	}
	@Override
	public String getCreditCardNo() {
		return creditCardNo;
	}
	@Override
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	@Override
	public String getCustomerName() {
		return customerName;
	}
	@Override
	public void setCustomerName(String customerName) {
		this.customerName = customerName;		
	}
	@Override
	public String getCardExpMonth() {
		return cardExpMonth;
	}
	@Override
	public void setCardExpMonth(String cardExpMonth) {
		this.cardExpMonth = cardExpMonth;
	}
	@Override
	public String getCardExpYear() {
		return cardExpYear;
	}
	@Override
	public void setCardExpYear(String cardExpYear) {
		this.cardExpYear = cardExpYear;
	}
	@Override
	public Short getCardCVVNo() {
		return cardCVVNo;
	}
	@Override
	public void setCardCVVNo(Short cardCVVNo) {
		this.cardCVVNo = cardCVVNo;
	}
	@Override
	public Double getAmount() {
		return amount;
	}
	@Override
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		// Replace with new toString
		//return "XpayImpl [creditCardNo=" + creditCardNo + ", customerName=" + customerName + ", cardExpMonth="
				//+ cardExpMonth + ", cardExpYear=" + cardExpYear + ", cardCVVNo=" + cardCVVNo + ", amount=" + amount
				//+ "]";
		return adap.getPayDString();
	}
}
