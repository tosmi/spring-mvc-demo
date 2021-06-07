<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName"/>
			
			<br><br>
			
			Last Name: <form:input path="lastName"/>
			
			<br><br>
			
			Country: 
			
			<form:select path="country">
				<form:options items="${student.countryOptions}"/>
				<form:options items="${theCountryOptions}" />
			</form:select>	
			
			<br><br>
			
			Favorite Language: 
			Java <form:radiobutton path="favoriteLanguage" value="java"/>
			Clojure <form:radiobutton path="favoriteLanguage" value="clojure"/>
			Python <form:radiobutton path="favoriteLanguage" value="python"/>
			Go <form:radiobutton path="favoriteLanguage" value="go"/>
			
			<br><br>		
			
			<input type="submit" value="Submit"/>
			
		</form:form>
	</body>
	
</html> 