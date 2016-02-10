package week5.composite;

import java.util.List;
import java.util.ArrayList;

public class HtmlParentElement extends HtmlTag {

	List<HtmlTag> children;
	String tag;
	String startTag;
	String endTag;
	
	public HtmlParentElement (String tag) {
		children = new ArrayList<HtmlTag>();
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
	public void addChildTag(HtmlTag htmlTag) {
		children.add(htmlTag);
	}
	
	@Override 
	public List<HtmlTag> getChildren() {
		return children;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for (HtmlTag e : children) {
			e.generateHtml();
		}
		System.out.println(endTag);
	}
}
