<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
	</body>
</html>