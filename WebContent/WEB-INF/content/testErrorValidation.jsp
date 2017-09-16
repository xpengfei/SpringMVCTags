<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
	<!-- 当没有指定form标签的id时,会自动获取该form标签绑定的Model中对应属性名为command作为id,
			当然也可以通过ModelAttribute属性来指定获取model中的属性名称是什么,比如在这里指定
			获取model中名为user的对象 -->
	<form:form modelAttribute="errorsUser" method="post" action="testErrorValidation">
		<table>
			<tr>
				<td>姓名:</td>
				<td>
					<!-- input标签没有指定id的时候,它会自动获取path指定的属性值作为它的id和name -->
					<form:input path="username"/>
				</td>
				<td>
					<font color="red">
						<form:errors path="username"></form:errors>
					</font>
				</td>
			</tr>
			
			<tr>
				<td>性别:</td>
				<td>
					<form:input path="sex"/>
				</td>
				<td>
					<font color="red">
						<form:errors path="sex"></form:errors>
					</font>
				</td>
			</tr>
			
			<tr>
				<td>年龄:</td>
				<td>
					<form:input path="age"/>
				</td>
				<td>
					<font color="red">
						<form:errors path="age"></form:errors>
					</font>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="提交">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>