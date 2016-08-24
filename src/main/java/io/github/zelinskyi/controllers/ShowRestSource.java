package io.github.zelinskyi.controllers;

import io.github.zelinskyi.entities.Show;
import io.github.zelinskyi.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController(value = "/show")
public class ShowRestSource {
	
	@Autowired
	private ShowService showService;
	
	@RequestMapping("/{id}")
	public Show getById(String showId) {
		
		return showService.getBy(showId);
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void save(@Valid Show show) {
		
		showService.save(show);
	}
}
