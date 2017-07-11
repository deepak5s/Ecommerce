<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<form action="${pageContext.request.contextPath}/perform_login"  method="post">

	<table align="right">
		<thead bgcolor="pink">
		<tr>
			<th colspan="2">Login</th>
			</tr>
		</thead>
		<tr bgcolor="gray">
			<td>User Name</td>
			<td><input type="text" name="username" required /></td>
		</tr>
		<tr bgcolor="gray">
			<td>Password</td>
			<td><input type="password" name="password" required /></td>
		</tr>
		<tr bgcolor="pink">
			<td colspan="2">
				<center>
					<input type="submit" value="SUBMIT" />
				</center>
			</td>
		</tr>
	</table>
</form>




</body>
</html>
