package io.github.zelinskyi.services;


import io.github.zelinskyi.entities.Show;

public interface ShowService {
	
	Show getBy(String showId);
	
	void save(Show show);
}
