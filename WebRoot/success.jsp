<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'success.jsp' starting page</title>
	</head>
	<body>
		<h1>
			SUCCESS
		</h1>
		<hr />
		<%=request.getParameter("width")%>
		<%=request.getParameter("height")%>
		<%=request.getParameter("row")%>
		<%=request.getParameter("col")%>
		<table>
			<tr>
				<s:iterator id="top" value="topText">
					<td>
						<s:property value="top" />
					</td>
				</s:iterator>
			</tr>
			<tr>
				<s:iterator id="buttom" value="buttomText">
					<td>
						<s:property value="buttom" />
					</td>
				</s:iterator>
			</tr>
			<s:property value="valueSize" />
			<s:iterator value="values" id="column" >
				<tr>
					<td>
						<s:property value="#column.key" />
					</td>
					<td>
						<s:property value="#column.value" />
					</td>
			</s:iterator>
			</tr>
		</table>

	</body>
</html>
