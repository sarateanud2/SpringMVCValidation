<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spfr"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<c:url value="resources/css/home.css"/>" >
<title>Insert title here</title>
</head>
<body>
	<spfr:form method="POST" commandName="customer" action="save.do">
	
		<table>
		
			<tr>
				<td>Employee ID::</td>
				<td><spfr:input path="id"/></td>
				<td><spfr:errors path="id" cssClass="error" />
			</tr>		
			
			<tr>
				<td>Employee Name:</td>
				<td><spfr:input path="name"/></td>
				<td><spfr:errors path="name" cssClass="error" />
			</tr>
			
			
			
			<tr>
				<td>Employee Role:</td>
				<td><spfr:select path="role" >
					<spfr:option value="" label="Select Role" />
					<spfr:option value="ceo" label="CEO" />
					<spfr:option value="developer" label="Developer" />
					<spfr:option value="manager" label="Manager" />
				</spfr:select></td>
				<td><spfr:errors path="role" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td colspan="3"><input type="submit" value="Save Customer"></td>
			</tr>
						
		</table>
	
	</spfr:form>
</body>
</html>

