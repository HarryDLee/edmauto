<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<script type="text/javascript" src="js/jquery.min.js">
</script>
	</head>

	<body>
		<div id="setting" align="center">
			<form method="post" action="create.action"
				style="border: 8px solid grey; background-color: silver; width: 300px;">
				<table>
					<tr>
						<td colspan="2">
							This is my JSP page.
						</td>
					</tr>
					<tr>
						<td>
							WIDTH:
						</td>
						<td>
							<input type="text" name="width" value="700">
						</td>
					</tr>
					<tr>
						<td>
							HEIGHT:
						</td>
						<td>
							<input type="text" name="height">
						</td>
					</tr>
					<tr>
						<td>
							COL*ROW
						</td>
						<td>
							<input type="text" size="5" name="col" value="1" onchange="javascript:updateCol(this)" />
							X
							<input type="text" size="5" name="row" value="1" onchange="javascript:updateRow(this)"/>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<div class="mdiv" id="mdiv">
								<div class="iptdiv">
									<select name="type[]">
										<option value="img">
											IMG
										</option>
										<option value="text">
											TEXT
										</option>
									</select><input type="text" name="value[]" class="ipt" />
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
			</form>
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
					'<div class="iptdiv" ><select name="type[]"><option value="img">IMG</option><option value="text">TEXT</option></select><input type="text" name="value[]" class="ipt" /></div>');
}
function updateCol(e){
	col = e.value;
	update();
}
function updateRow(e){
	row = e.value;
	update();
}
function update(){
	$(".iptdiv").remove();
	var num = col * row;
	for(var i = 0;i<num;i++)
		addInput();
}
</script>
	</body>
</html>
