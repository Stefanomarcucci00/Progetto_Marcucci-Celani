package Project.controller;

import java.awt.List;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Project.Stats_and_filters.Filter;
import Project.models.Data_of_Tweet;
import Project.models.Tweet;
import Project.models.User;

/** Rappresenta la classe che gestisce tutte le chiamate al Server 
 * permesse al Client.
 * @author Stefano Marcucci
 * @author Alessandro Celani
 * 
 */
@RestController
public class Controller {
	
	@Autowired 
	Data_of_Tweet api_twitter;
	@Autowired
	Filter api_filters;
	@Autowired
	Filter api_statistics;
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from the developers!";
	}
	@RequestMapping(value="/tweets",method = RequestMethod.GET)
  	public ArrayList<Tweet> getTweets() {
		return (api_twitter.getTweets());
	}
	@RequestMapping(value="/users",method = RequestMethod.GET)
	public ArrayList<User> geUsers() {
	return (api_twitter.getUsers()) ;
	}	
	/*@RequestMapping(value="/users",method = RequestMethod.POST)
	public ArrayList<User> getFilteredTweets() {
	return (api_filters.)) ;
	}	
	*/
}

