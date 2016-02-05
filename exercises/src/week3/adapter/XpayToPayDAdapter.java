package week3.adapter;

public class XpayToPayDAdapter {
	PayD pd;
	
	public XpayToPayDAdapter(XpayImpl xp) {
		pd = new PayDImpl(xp.getCreditCardNo(), xp.getCustomerName(), xp.getCardExpMonth() + "/" + xp.getCardExpYear(), new Integer(xp.getCardCVVNo()), xp.getAmount() );
	}
	public String getPayDString() {
		return pd.toString();
	}
}
