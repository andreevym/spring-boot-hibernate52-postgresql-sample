package ru.android_studio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.android_studio.entities.Page;
import ru.android_studio.service.PageService;

import java.util.List;

@RestController
public class PageController {
	
	@Autowired
	private PageService pageService;
		
	@RequestMapping(value="/pages", method= RequestMethod.GET)
	public List<Page> findTitle(@RequestParam(value="title") String title) {
		return pageService.findByTitle(title);
	}
}
