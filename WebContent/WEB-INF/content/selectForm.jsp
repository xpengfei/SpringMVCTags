<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>selectForm测试</title>
</head>
<body>
	<form:form modelAttribute="sUser" method="post" action="selectForm">
		<table>
			<tr>
				<td>部门:</td>
				<td>
					<form:select path="deptId">
						<form:options items="${deptList}"
								itemLabel="name" itemValue="id"/>
					</form:select>
				</td>
			</tr>
		</table>
	
	</form:form>
</body>
</html>