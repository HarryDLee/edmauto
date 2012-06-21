package cn.medm.Auto.Action;


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
	private String type[];
	private String value[];
	
	public String create() throws Exception {
		System.out.println("为什么打印不出来呢？");
		System.out.println(this.toString());
		if(Integer.valueOf(this.getWidth()) == 700)
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

	
	public String[] getType() {
		return type;
	}

	public void setType(String[] type) {
		this.type = type;
	}

	public String[] getValue() {
		return value;
	}

	public void setValue(String[] value) {
		this.value = value;
	}

	public String toString(){
		return this.getWidth() + this.getHeight() + this.getRow() + this.getCol() + this.getValue();
	}
	
	
}
