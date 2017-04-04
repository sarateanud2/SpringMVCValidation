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
				<td>Name:</td>
				<td><spfr:input path="name"/></td>
				<td><spfr:errors path="name" cssClass="error" />
			</tr>		
			
			<tr>
				<td>Email:</td>
				<td><spfr:input path="email"/></td>
				<td><spfr:errors path="email" cssClass="error" />
			</tr>
			
			<tr>
				<td>Age:</td>
				<td><spfr:input path="age"/></td>
				<td><spfr:errors path="age" cssClass="error" />
			</tr>
			
			<tr>
				<td>Birthday:</td>
				<td><spfr:select path="gender">
					<spfr:option value="" label="Select Gender" />
					<spfr:option value="MALE" label="Male" />
					<spfr:option value="FEMALE" label="Female" />
				</spfr:select></td>
				<td><spfr:errors path="gender" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td>Birthday:</td>
				<td><spfr:input path="birthday" placeholder="MM/dd/yyyy"/></td>
				<td><spfr:errors path="birthday" cssClass="error" />
			</tr>
			
			<tr>
				<td>Phone:</td>
				<td><spfr:input path="phone" /></td>
				<td><spfr:errors path="phone" cssClass="error" />
			</tr>
			
			<tr>
				<td colspan="3"><input type="submit" value="Save Customer"></td>
			</tr>
						
		</table>
	
	</spfr:form>
</body>
</html>

