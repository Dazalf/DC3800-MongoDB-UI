package bx_data.analytics.bx_data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * This is simply the controller for handling requests to access the homepage and query views..
 * @author alf-s
 *
 */

@Controller
public class HomeController {
	
	@RequestMapping("/homepage")
	public String getHomepage() {
		
		return "index";
	}
	
	@RequestMapping("/ratings/books")
	public String getBookRatingsView() {
		
		return "averageBookRatings";
	}
	
	@RequestMapping("/ratings/author")
	public String getAuthorRatingsView() {
		
		return "averageAuthorRatings";
	}
	
	@RequestMapping("/ratings/publisher")
	public String getPublisherRatingsView() {
		
		return "averagePublisherRatings";
	}
}
