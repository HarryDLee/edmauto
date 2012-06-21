package cn.medm.Auto.Pojo;

import java.util.ArrayList;
import java.util.List;

public class Tag {
	//<a></a>
	
	private String tag;
	private int type;//enum 0:only text 1:normal tag 2:without end tag
	private List<Property> properties = new ArrayList<Property>();
	private List<Tag> innerTags = new ArrayList<Tag>();
	private String remark;
	
	
	public Tag(String tag, int type) {
		super();
		this.tag = tag;
		this.type = type;
	}
	
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getProperties() {
		String value = "";
		for(Property p : this.properties){
			value += " " + p.toString();
		}
		return value;
	}
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
	
	public void addProperty(Property property){
		this.properties.add(property);
	}
	
	public String getInnerTags() {
		String value = "";
		for(Tag t : this.innerTags){
			value += t.toString();
		}
		return value;
	}
	public void setInnerTags(List<Tag> innerTags) {
		this.innerTags = innerTags;
	}
	
	public void delInnerTag(Tag innerTag){
		this.innerTags.remove(innerTag);
	}
	
	public void addInnerTag(Tag innerTag){
		this.innerTags.add(innerTag);
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
	private String getTagBeginLeft(){
		if(this.getType() == 0)
			return this.getTag();
		return "<"+this.getTag()+ (this.properties.size()>0?" ":"");
	}
	
	private String getTagBeginRight(){
		if(this.getType() == 1)
			return ">";
		else if(this.getType() == 2)
			return "/>";
		else
			return "";
	}
	
	private String getTagEnd(){
		if(this.getType() == 1)
			return "</"+this.getTag()+">\n";
		return "";
	}
	
	@Override
	public String toString() {
		return this.getTagBeginLeft()+
		this.getProperties() + 
		this.getTagBeginRight() + "\n" +
		this.getInnerTags() + 
		this.getTagEnd();
	}
	
	
}
