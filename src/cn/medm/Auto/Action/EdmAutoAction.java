package cn.medm.Auto.Action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class EdmAutoAction extends ActionSupport {

	/*edm html auto system*/
	String width;
	String height;
	int row;
	int col;
	List<String> values;
	
	public String create() throws Exception {
		System.out.println(this.toString());
		
		if(true)
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
	public String getValues() {
		String result = "";
		for(String value : this.values){
			result += "\n" + value;
		}
		return result;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}
	
	public String toString(){
		return this.getWidth() + this.getHeight() + this.getRow() + this.getCol() + this.getValues();
	}
	
	
}
