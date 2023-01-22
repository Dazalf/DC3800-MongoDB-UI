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
	     	<div class="container">
	     		
				<h3> Get the average rating of an author for all of their books, on its own, or by demographics! </h3>
	     		
				 <form class="pt-3" id="form" action="/averageAuthorRating" method="GET">		
						
						<div class="row border p-3"> 		
							<div class="form-group pt-3 col">
								<p> <b> Get the average rating of an author </b> </p>								
					  			<input type="text" class="form-control" name="author" id="author" placeholder="Input author name" required />    
					 		</div>
					 		
					 		<div class="pt-3">
			 	  				<button type="submit" value="Submit" class="btn btn-primary">Submit query</button>
			 	  			</div>
				 		</div>		    
				 </form>
				 
				 <form class="pt-3" id="form" action="/averageAuthorRatingByAge" method="GET">		
						
						<div class="row border p-3">	 		
							<div class="form-group pt-3 col">
								<p> <b> Get the average rating of an author, filtered by the age of the users who provided the ratings </b> </p>
					  			<input type="text" class="form-control" name="author" id="author" placeholder="Input author name" required /> 
					  			<input type="number" class="form-control" name="age" id="age" min="0" placeholder="Input age" required />    
					 		</div>
					 		
					 		<div class="pt-3">
			 	  				<button type="submit" value="Submit" class="btn btn-primary">Submit query</button>
			 	  			</div>
				 		</div>	    
				 </form>
				 
				 <form class="pt-3" id="form" action="/averageAuthorRatingByLocation" method="GET">		
						
						<div class="row border p-3"> 	 		
							<div class="form-group pt-3 col">
								<p> <b> Get the average rating of an author, filtered by the location of the users who provided the ratings </b> </p>							
					  			<input type="text" class="form-control" name="author" id="author" placeholder="Input author name" required /> 
					  			<input type="text" class="form-control" name="location" id="location" placeholder="Input location" required /> 
					 		</div>
						 		
							<div class="pt-3">
				 	  			<button type="submit" value="Submit" class="btn btn-primary">Submit query</button>
				 	  		</div>
				 		</div>	    
				 </form>	
	     		
	     	</div>
	     </section>
		
	</main>
	
	<jsp:include page="footer.jsp"/>
    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
    
  </body>
</html>