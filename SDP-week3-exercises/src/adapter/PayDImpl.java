package adapter;

public class PayDImpl implements PayD {
	private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;
	
    public PayDImpl(String custCardNo, String cardOwnerName, String cardExpMonthDate, Integer cVVNo, Double totalAmount) {
		this.custCardNo = custCardNo;
		this.cardOwnerName = cardOwnerName;
		this.cardExpMonthDate = cardExpMonthDate;
		this.cVVNo = cVVNo;
		this.totalAmount = totalAmount;
	}


	public String getCustCardNo() {
		return custCardNo;
	}


	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}


	public String getCardOwnerName() {
		return cardOwnerName;
	}


	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}


	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}


	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}


	public Integer getCVVNo() {
		return cVVNo;
	}


	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
	}


	public Double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}


	@Override
	public String toString() {
		return "PayDImpl [custCardNo=" + custCardNo + ", cardOwnerName=" + cardOwnerName + ", cardExpMonthDate="
				+ cardExpMonthDate + ", cVVNo=" + cVVNo + ", totalAmount=" + totalAmount + "]";
	}

}
