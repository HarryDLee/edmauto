package cn.medm.Auto.Test;

import cn.medm.Auto.Pojo.Property;
import cn.medm.Auto.Pojo.Tag;
import junit.framework.TestCase;


public class SampleTest extends TestCase{
	
	Tag table = new Tag("table",1);
	Tag tr = new Tag("tr",1);
	Tag td = new Tag("td",1);
	Tag a = new Tag("a",1);
	Tag p = new Tag("p",1);
	Tag font = new Tag("font",1);
	Tag img = new Tag("img",1);
	
	Tag line1 = new Tag("您好，您收到这封邮件，是因为我们获悉您经常需要把产品通过EDM（电子邮件营销）进行宣传。我们希望可以帮助到您！",0);
	Tag line2 = new Tag("如果您没有正确显示此邮件的内容，您可以点击这里查看完整邮件：",0);
	Tag line3 = new Tag("美工也许可以做出漂亮的设计，",0);
	Tag line4 = new Tag("但是却无法保证能够正常显示。",0);
	Tag line5 = new Tag("My Email Direct Marketing Software，",0);
	Tag line6 = new Tag("for designers and their clients",0);
	Tag line7 = new Tag("联系QQ：3185218<br  />或者您可以发送邮件给我们：3185218@qq.com",0);
	Tag line8 = new Tag("如果您不想订阅此服务，您可以退订此邮件。",0);
	Tag line9 = new Tag("点击这里查看",0);
	Tag line10 = new Tag("点击这里退订。",0);
	
	Property table_style = new Property("style",0,"MARGIN: 0px auto; LETTER-SPACING: normal;");
	Property table_border = new Property("border",0,"0");
	Property table_cellspacing = new Property("cellspacing",0,"0");
	Property table_cellpadding = new Property("cellpadding",0,"0");
	Property table_width = new Property("width",0,"700");
	Property table_bgcolor = new Property("bgcolor",0,"#f3f3f3");
	Property td_colspan_2 = new Property("colspan",0,"2");
	Property align_center = new Property("align",0,"center");
	Property align_right = new Property("align",0,"right");
	Property font_color = new Property("color",0,"#555555");
	Property a_href = new Property("href",0,"http://www.medm.cn");
	Property a_target = new Property("target",0,"_blank");
	Property img_style = new Property("style",0,"DISPLAY: block");
	Property img_border = new Property("border",0,"0");
	Property img_src_1 = new Property("src",0,"https://public.sn2.livefilestore.com/y1pn-d5I9W8gao3yZFglkGfnv_P2Irn0v3UfdnoBveQ87TfbfrxlFcCsuUYbn57F7LHpFLfCz6obpFSrJVq0gLjCQ/1.gif?psid=1");
	Property img_src_2 = new Property("src",0,"https://fvsxzw.sn2.livefilestore.com/y1psWQ3rxzkicYGGhT2qmRnPf2VDVLZ5eXCMql5Z_CDRjAEuDs3JRxOwWsHuoVKGnBvMCUIOzI3_GEjlz8CIqeHK0XchgJtt7B0/2.gif?psid=1");
	Property img_src_3 = new Property("src",0,"https://fvsxzw.sn2.livefilestore.com/y1pyyqyxs5epiu_-dZYVSiNZLI-rHguvTUu6F8WI9uTBi4S-A0RNq-HT4qLM8nczOYcZw5me4oRK7h9PJ9_jpilA_3y-EdmRT4n/3.gif?psid=1");
	Property img_src_4 = new Property("src",0,"https://fvsxzw.sn2.livefilestore.com/y1pFtvvIIKYY-8n6Xju-23t9RU9bfQDmk0r_75LmeEy2cczHUL0Nn_SQVLMjX-eLUTvH816H7OOuuCtmkU2QiXfLYWlldoZ5SHd/4.gif?psid=1");
	Property img_width = new Property("width",0,"350");
	Property img_height_1 = new Property("height",0,"262");
	Property img_height_2 = new Property("height",0,"263");

	public void testEmpty() {
		System.out.println("hello world!");

		table.addProperty(table_style);
		table.addProperty(table_cellspacing);
		table.addProperty(table_cellpadding);
		table.addProperty(table_width);
		table.addProperty(table_bgcolor);

		td.addProperty(td_colspan_2);
		
		p.addProperty(align_center);
		
		p.addProperty(font_color);
		p.addInnerTag(line1);
		td.addInnerTag(p);
		tr.addInnerTag(td);
		table.addInnerTag(tr);
		//------------------------------------------------
		p = new Tag("p",1);
		p.addProperty(align_center);
		p.addProperty(font_color);
		p.addInnerTag(line2);
		
		a = new Tag("a",1);
		
		a.addProperty(a_href);
		a.addProperty(a_target);
		a.addInnerTag(line9);
		p.addInnerTag(a);
		
		td = new Tag("td",1);
		td.addProperty(td_colspan_2);
		
		td.addInnerTag(p);
		
		tr = new Tag("tr",1);
		tr.addInnerTag(td);
		table.addInnerTag(tr);
		//------------------------------------------------
		p = new Tag("p",1);
		p.addProperty(align_right);
		p.addInnerTag(line3);
		
		a = new Tag("a",1);
		
		a.addProperty(a_href);
		a.addProperty(a_target);
		
		img = new Tag("img",2);
		img.addProperty(img_style);
		img.addProperty(img_border);
		img.addProperty(img_src_1);
		img.addProperty(img_width);
		img.addProperty(img_height_1);
		a.addInnerTag(img);
		
		td = new Tag("td",1);
		
		td.addInnerTag(p);
		td.addInnerTag(a);
		
		tr = new Tag("tr",1);
		tr.addInnerTag(td);
		//-----------------
		p = new Tag("p",1);
		p.addInnerTag(line4);
		
		a = new Tag("a",1);
		
		a.addProperty(a_href);
		a.addProperty(a_target);
		
		img = new Tag("img",2);
		img.addProperty(img_style);
		img.addProperty(img_border);
		img.addProperty(img_src_2);
		img.addProperty(img_width);
		img.addProperty(img_height_1);
		a.addInnerTag(img);
		
		td = new Tag("td",1);
		
		td.addInnerTag(p);
		td.addInnerTag(a);
		
		tr.addInnerTag(td);
		
		table.addInnerTag(tr);
		//----------------------------------------------------
		p = new Tag("p",1);
		p.addProperty(align_right);
		p.addInnerTag(line5);
		
		a = new Tag("a",1);
		
		a.addProperty(a_href);
		a.addProperty(a_target);
		
		img = new Tag("img",2);
		img.addProperty(img_style);
		img.addProperty(img_border);
		img.addProperty(img_src_3);
		img.addProperty(img_width);
		img.addProperty(img_height_2);
		a.addInnerTag(img);
		
		td = new Tag("td",1);
		
		td.addInnerTag(a);
		td.addInnerTag(p);
		
		tr = new Tag("tr",1);
		tr.addInnerTag(td);
		//-----------------
		p = new Tag("p",1);
		p.addInnerTag(line6);
		
		a = new Tag("a",1);
		
		a.addProperty(a_href);
		a.addProperty(a_target);
		
		img = new Tag("img",2);
		img.addProperty(img_style);
		img.addProperty(img_border);
		img.addProperty(img_src_4);
		img.addProperty(img_width);
		img.addProperty(img_height_2);
		a.addInnerTag(img);
		
		td = new Tag("td",1);
		
		td.addInnerTag(a);
		td.addInnerTag(p);
		
		tr.addInnerTag(td);
		table.addInnerTag(tr);
		//----------------------------------------------------
		font = new Tag("font",1);
		font.addProperty(font_color);
		font.addInnerTag(line7);
		
		p = new Tag("p",1);
		p.addInnerTag(font);
		
		td = new Tag("td",1);
		td.addInnerTag(p);
		
		tr = new Tag("tr",1);
		tr.addInnerTag(td);
		//-----------------

		a = new Tag("a",1);
		
		a.addProperty(a_href);
		a.addProperty(a_target);
		a.addInnerTag(line10);
		
		font = new Tag("font",1);
		font.addProperty(font_color);
		font.addInnerTag(line8);
		font.addInnerTag(a);

		p = new Tag("p",1);
		p.addInnerTag(font);
		
		td = new Tag("td",1);
		td.addInnerTag(p);
		
		tr.addInnerTag(td);
		table.addInnerTag(tr);
		
		System.out.println(table.toString());
	} 

}
