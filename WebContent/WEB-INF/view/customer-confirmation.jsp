<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
	<head>
		<title>Customer confirmation</title>
	</head>

	<body>
	    The is customer confirmed: ${customer.firstName} ${customer.lastName}
	    <br/><br/>
	    
	    Free Passes: ${customer.freePasses}
	    <br/><br/>
	    
	    Postal Code: ${customer.postalCode}
	    <br/><br/>
	</body>
</html>