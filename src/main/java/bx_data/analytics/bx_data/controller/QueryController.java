package bx_data.analytics.bx_data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import bx_data.analytics.bx_data.model.BookRatings;

/**
 * This is simply the controller for handling queries and returning results.
 * @author alf-s
 *
 */

@Controller
public class QueryController {
	
	@RequestMapping(value = "/averageBookRating", method = RequestMethod.GET)
	public String getAverageBookRating(@RequestParam String isbn, Model model) throws Exception {
		
		BookRatings br = new BookRatings();
		String result = br.getAvgBookRating(isbn);
		model.addAttribute("details", result);
		
		return "results";
	}
	
	@RequestMapping(value = "/averageBookRatingByAge", method = RequestMethod.GET)
	public String getAverageBookRatingByAge(@RequestParam String isbn, @RequestParam int age, Model model) throws Exception {
		
		BookRatings br = new BookRatings();
		String result = br.getAvgBookRatingByAge(isbn, age);
		model.addAttribute("details", result);
		
		return "results";
	}
	
	@RequestMapping(value = "/averageBookRatingByLocation", method = RequestMethod.GET)
	public String getAverageBookRatingByLocation(@RequestParam String isbn, @RequestParam String location, Model model) throws Exception {
		
		BookRatings br = new BookRatings();
		String result = br.getAvgBookRatingByLocation(isbn, location);
		model.addAttribute("details", result);
		
		return "results";
	}
	
	@RequestMapping(value = "/averageAuthorRating", method = RequestMethod.GET)
	public String getAverageAuthorRating(@RequestParam String author, Model model) throws Exception {
		
		BookRatings br = new BookRatings();
		String result = br.getAvgAuthorRating(author);
		model.addAttribute("details", result);
		
		return "results";
	}
	
	@RequestMapping(value = "/averageAuthorRatingByAge", method = RequestMethod.GET)
	public String getAverageAuthorRatingByAge(@RequestParam String author, @RequestParam int age, Model model) throws Exception {
		
		BookRatings br = new BookRatings();
		String result = br.getAvgAuthorRatingByAge(author, age);
		model.addAttribute("details", result);
		
		return "results";
	}
	
	@RequestMapping(value = "/averageAuthorRatingByLocation", method = RequestMethod.GET)
	public String getAverageAuthorRatingByLocation(@RequestParam String author, @RequestParam String location, Model model) throws Exception {
		
		BookRatings br = new BookRatings();
		String result = br.getAvgAuthorRatingByLocation(author, location);
		model.addAttribute("details", result);
		
		return "results";
	}
	
	@RequestMapping(value = "/averagePublisherRating", method = RequestMethod.GET)
	public String getAveragePublisherRating(@RequestParam String publisher, Model model) throws Exception {
		
		BookRatings br = new BookRatings();
		String result = br.getAvgPublisherRating(publisher);
		model.addAttribute("details", result);
		
		return "results";
	}
}
