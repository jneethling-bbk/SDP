package week5.composite;

public class HtmlElement extends HtmlTag {
	
	String tag;
	String startTag;
	String endTag;
	String tagBody;
	
	public HtmlElement(String tag) {
		this.tag = tag;
	}
	
	@Override
	public String getTagName() {
		return tag;
	}

	@Override
	public void setStartTag(String tag) {
		startTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		endTag = tag;
	}
	
	@Override
	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}
	
	@Override
	public void generateHtml() {
		System.out.println(startTag + tagBody + endTag);
	}

	
}
