package observer;

import java.util.List;

public class CommentaryObject implements Subject, Commentary {
    private List<Observer> subscribers;
    private String title;
    private String desc;
    private boolean changed = false;
	
	public CommentaryObject(List<Observer> subscribers, String title) {
		this.subscribers = subscribers;
		this.title = title;
	}

    @Override
    public void subscribeObserver(Observer observer) {
    	subscribers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
    	subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
    	for (Observer ob : subscribers) {
    		ob.update(desc);
    	}
    	changed = false;
    }

    @Override
    public String subjectDetails() {
        return title;
    }
    @Override
    public void setDesc(String desc) {
    	if (!desc.equals(this.desc)) {
    		changed = true;
    		this.desc = desc;
    		notifyObservers();
    	}
    }
}
