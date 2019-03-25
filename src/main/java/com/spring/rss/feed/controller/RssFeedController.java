package com.spring.rss.feed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.View;

import com.spring.rss.feed.view.RssFeedView;

@RestController
public class RssFeedController {

	 @Autowired
	    private RssFeedView view;
	     
	    @GetMapping("/rss")
	    public View getFeed() {
	        return view;
	    }
}
