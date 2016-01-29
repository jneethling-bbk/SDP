package observer;

public class SMSUsers implements Observer {
    private Subject s;
    private String msg;
	
	public SMSUsers(Subject s, String msg) {
		this.s = s;
		this.msg = msg;
	}

    @Override
    public void update(String desc) {
    	System.out.println(msg + " now getting update: " + desc);
    }

    @Override
    public void subscribe() {
    	s.subscribeObserver(this);
    }

    @Override
    public void unSubscribe() {
    	s.unSubscribeObserver(this);
    }
}
