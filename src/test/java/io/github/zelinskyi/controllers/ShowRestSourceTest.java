package io.github.zelinskyi.controllers;


import io.github.zelinskyi.services.ShowService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ShowRestSourceTest {
	
	private static final String SHOW_ID = "1";
	@Mock
	private ShowService showService;
	@InjectMocks
	private ShowRestSource showRestSource = new ShowRestSource();
	
	@Test
	public void testGetById() {
		showRestSource.getById(SHOW_ID);
		verify(showService).getBy(SHOW_ID);
	}
}