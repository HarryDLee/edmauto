<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/ckeditor/ckeditor.js"></script>

	</head>

	<body>
		<div>
			<div id="hiddenButton" style="left: 5px;top: 10px; position: fixed;float: left;">
				<input type="button" value="显示/隐藏" onclick="changeShow()">
				<input type="button" value="表格样式" onclick="changeTableShow()">
				<input type="button" value="顶层文字" onclick="changeTopText()">
				<input type="button" value="底层文字" onclick="changeButtomText()">
				
			</div>
			<div id="setting"
				style="left: 10px; top: 50px; position: fixed; float: left;border: 8px solid grey; width: 450px;">
				<div id="tableArea">
				<p align="center" style="background-color: silver">表格样式</p>
					<form method="post" action="create.action">
						<table>
							<tr>
								<td width="40%" align="right">
									WIDTH:
								</td>
								<td>
									<input type="text" name="width" value="700">
								</td>
							</tr>
							<tr>
								<td width="40%" align="right">
									HEIGHT:
								</td>
								<td>
									<input type="text" name="height" value="1024">
								</td>
							</tr>
							<tr>
								<td width="40%" align="right">
									COL*ROW:
								</td>
								<td>
									<input type="text" size="5" name="col" value="1"
										onchange="javascript:updateCol(this)" />
									X
									<input type="text" size="5" name="row" value="1"
										onchange="javascript:updateRow(this)" />
								</td>
							</tr>
							<tr>
								<td width="40%" align="right"></td>
								<td align="right">
									<div class="mdiv" id="mdiv">
										<div class="iptdiv">
											<select name="type" id="type">
												<option value="img">
													IMG
												</option>
												<option value="text">
													TEXT
												</option>
											</select>
											<input type="text" id="value" name="value" class="ipt" value="http://www.medm.cn" />
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td colspan="2" align="center">
									<input type="submit" />
									<a href="javascript:addInput()">增加</a>
								</td>
							</tr>
						</table>
					
				</div>
				<div id="topTextArea">
					<p align="center" style="background-color: silver">顶层文字</p>
					<textarea id="topText" class="ckeditor" name="topText" rows="5" cols="50"></textarea>
					
				</div>
				<div id="buttomTextArea">
					<p align="center" style="background-color: silver">底层文字</p>
					<textarea id="buttomText" name="buttomText" class="ckeditor" rows="5" cols="50"></textarea>
				</div>
				</form>
			</div>
			<div align="center"
				style="height: 1400px; background-color: silver; position: fixed; float: left; right: 0px;">
				<table border="1px solid black" width="700px" height="100%">
					<tr>
						<td></td>
					</tr>
					<tr>
						<td></td>
					</tr>
					<tr>
						<td></td>
					</tr>
				</table>
			</div>
		</div>
		<script type="text/javascript">
var col = 1;
var row = 1;
$(document).ready(function() {
	bindListener();
});
function bindListener() {
	$("a[name=rmlink]").unbind().click(function() {
		$(this).parent().remove();
	})
}
function addInput() {
	$("#mdiv")
			.append(
					'<div class="iptdiv" ><select name="type" id="type"><option value="img">IMG</option><option value="text">TEXT</option></select><input type="text" id="value" name="value" class="ipt" /></div>');
}
function updateCol(e) {
	col = e.value;
	update();
}
function updateRow(e) {
	row = e.value;
	update();
}
function update() {
	$(".iptdiv").remove();
	var num = col * row;
	for ( var i = 0; i < num; i++)
		addInput();
}
function changeShow() {
	$("#setting").toggle(1000);
}
function changeTableShow() {
	$("#tableArea").toggle(1000);
}
function changeTopText(){
	$("#topTextArea").toggle(1000);
}
function changeButtomText(){
	$("#buttomTextArea").toggle(1000);
}
</script>
	</body>
</html>
