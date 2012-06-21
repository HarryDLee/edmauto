package cn.medm.Auto.Action;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class EdmAutoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String width;
	private String height;
	private int row;
	private int col;
	private List<String> type = new ArrayList<String>();
	private List<String> value = new ArrayList<String>();
	private List<String> topText = new ArrayList<String>();
	private List<String> buttomText = new ArrayList<String>();
	private Map<Integer,String> values = new HashMap<Integer,String>();
	private int valueSize;
	
	public String create() throws Exception {
		System.out.println(this.toString());
		if(type.get(0).equals("img"))
			return "success";
		else
			return "error";
	}
	
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}

	public List<String> getType() {
		return type;
	}

	public void setType(List<String> type) {
		this.type = type;
	}

	public List<String> getValue() {
		return value;
	}

	public int getValueSize(){
		valueSize = value.size();
		return valueSize;
	}
	
	public Map<Integer,String> getValues() {
		for(int i=0; i<type.size(); i++)
			values.put(i,type.get(i)+":"+value.get(i));
		return values;
	}
	
	public void setValue(List<String> value) {
		this.value = value;
	}

	public List<String> getTopText() {
		return topText;
	}

	public void setTopText(List<String> topText) {
		this.topText = topText;
	}

	public List<String> getButtomText() {
		return buttomText;
	}

	public void setButtomText(List<String> buttomText) {
		this.buttomText = buttomText;
	}

	public String toString(){
		return this.getWidth() + this.getHeight() + this.getRow() + this.getCol() + this.getValue();
	}
	
	
}
