<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>复选框测试</title>
</head>
<body>
	<form:form modelAttribute="checkBoxUser" method="post"
		action="checkbox">
		<table>
			<tr>
				<td>选择课程:</td>
				<td>
					<form:checkbox path="course" value="java" label="java" /> 
					<form:checkbox path="course" value="spring" label="spring" />
					<form:checkbox path="course" value="mybatis" label="mybatis" />
				</td>
			</tr>
		</table>
		<form:checkbox path="reader" value="true"/>已阅读相关协议
	</form:form>
</body>
</html>