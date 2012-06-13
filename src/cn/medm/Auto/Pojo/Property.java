package cn.medm.Auto.Pojo;

public class Property {

	//href="" style=""
	private String property;
	private int type;//0:normal like k="v"
	private String value;
	private String remark;
	public Property(String property, int type, String value) {
		super();
		this.property = property;
		this.type = type;
		this.value = value;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getValue() {
		if(this.getType() == 0)
			return "\""+value+"\" ";
		else return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return this.getProperty()+"="+this.getValue();
	}
	
}
