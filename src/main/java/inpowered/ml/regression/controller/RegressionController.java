package inpowered.ml.regression.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import inpowered.ml.regression.service.RegressionCountService;


@RestController
@RequestMapping(value="/api/regression/")
public class RegressionController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(RegressionController.class);
	
	@Autowired
	private RegressionCountService regressionCountService;
	
	@RequestMapping(value="/prediction/{link}/{title}/{summary}/{author_actor_id}/{pub_date}",method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Integer getViewCount(@PathVariable String link,@PathVariable String title, @PathVariable String summary, @PathVariable String author_actor_id, @PathVariable String pub_date) throws Exception{
		LOGGER.info("Sending request to get view count");
		return regressionCountService.getViewCount(link, title, summary, author_actor_id, pub_date);
	}
	
}

