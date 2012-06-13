package cn.medm.Auto.tool;

import cn.medm.Auto.Pojo.Property;
import cn.medm.Auto.Pojo.Tag;

public class MyHtml {
	
	enum TAGTYPE{ONLY_TEXT,NORMAL,NO_END};
	private String version;
	private String remark;
	
	private Tag a;
	private Tag table;
	private Tag tr;
	private Tag td;
	private Tag img;
	private Tag text;
	private Tag p;
	private Tag font;
	
	private Property cellspacing;
	private Property cellpadding;
	private Property bgcolor;
	private Property href;
	private Property target;
	private Property colspan;
	private Property rowspan;
	private Property style;
	private Property border;
	private Property src;
	private Property color;
	private Property width;
	private Property height;
	
	public MyHtml(String version, String remark) {
		super();
		this.version = version;
		this.remark = remark;

		a = new Tag("a",TAGTYPE.NORMAL.ordinal());
		table = new Tag("table",TAGTYPE.NORMAL.ordinal());
		tr = new Tag("tr",TAGTYPE.NORMAL.ordinal());
		td = new Tag("td",TAGTYPE.NORMAL.ordinal());
		img = new Tag("img",TAGTYPE.NORMAL.ordinal());
		text = new Tag("text",TAGTYPE.ONLY_TEXT.ordinal());
		p = new Tag("p",TAGTYPE.NORMAL.ordinal());
		font = new Tag("font",TAGTYPE.NORMAL.ordinal());
		
		cellspacing = new Property("cellspacing",0,"0");
		cellpadding = new Property("cellpadding",0,"0");
		bgcolor = new Property("bgcolor",0,"#f3f3f3");
		href = new Property("href",0,"http://www.medm.cn");
		target = new Property("target",0,"_blank");
		colspan = new Property("colspan",0,"2");
		rowspan = new Property("rowspan",0,"2");
		style = new Property("style",0,"");
		border = new Property("border",0,"0");
		src = new Property("src",0,"");
		color = new Property("color",0,"#555555");
		width = new Property("width",0,"700");
		height = new Property("height",0,"525");
	}
}
