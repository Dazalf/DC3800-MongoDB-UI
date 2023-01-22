<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html class="h-100">
	<head>
	    <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>Homepage</title>
	    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
 	</head>
  	
  	<body class="d-flex flex-column h-100">
  	
  	<jsp:include page="navigation.jsp"/>
     
	    <main role="main" class="flex-shrink-0 my-auto">

		     <section class="text-center p-4">
		     	<div class="container border">
		     		<div class="row">
			     		<div class="col-12 p-3">
						 	<h1> Welcome to BX Data Analytics</h1>
						 </div>
					 	
					 	<div class="col-12 p-3">
					 		<h2> Do you need high quality insights into books, authors, and publishers?  </h2>
					 	</div>
					 	
					 	<div class="col-12 p-3">
							 <p> We provide an average rating for all three of these, which can be further broken down by the age or location of those who provided these ratings. To get started, simply 
							 go to the pages linked in the navigation bar above!</p>
						 </div>
						 
						 <div class="col-12 p-3">
							 <p>As of right now, our queries are case sensitive. Therefore, please make sure when inputting the name of an author or publisher,
							 that the capitalization is correct. For example, 'J. R. R. Tolkien' would be correct, whereas 'j. r. r. tolkien' would yield no results. 
							  This is something we looking to fix. </p>
						 </div>
					</div>
		     	</div>
		     </section>
			
		</main>
	    
	    <jsp:include page="footer.jsp"/>
	    
	    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
	    
  </body>
</html>