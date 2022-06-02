<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Confirmation</title>
	</head>
	<body>
		The student is confirmed: ${student.firstName} ${student.lastName}
		<br>
		The student is in ${student.country}
		<br>
		The student's favorite language is ${student.favoriteLanguage}
		<br>
		The student's OSes are:
		<ul>
			<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
			</c:forEach>
		</ul>
	</body>
</html>