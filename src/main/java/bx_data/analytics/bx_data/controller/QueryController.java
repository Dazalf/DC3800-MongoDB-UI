package bx_data.analytics.bx_data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bx_data.analytics.bx_data.model.BookRatings;

/**
 * This is simply the controller for handling queries and returning results.
 * @author alf-s
 *
 */

@Controller
public class QueryController {
	
	@RequestMapping("/averageBookRating")
	public String getAverageBookRating(@RequestParam String isbn, Model model) throws Exception {
		
		BookRatings br = new BookRatings();
		String result = br.getAvgBookRating(isbn);
		model.addAttribute("details", result);
		
		return "results";
	}
}
