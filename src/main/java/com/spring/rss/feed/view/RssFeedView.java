package com.spring.rss.feed.view;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Item;


/**
 * @author sunainag
 * 
 *  Build the actual feed.
 *  To do this, extend the AbstractRssFeedView class and implement two of its methods.
 *  The first one will receive a Channel object as input and will populate it with the feed’s metadata.
 *  The other will return a list of items which represents the feed’s content:
 *
 */

@Component
public class RssFeedView extends AbstractRssFeedView {
 
    @Override
    protected void buildFeedMetadata(Map<String, Object> model, 
      Channel feed, HttpServletRequest request) {
        feed.setTitle("Baeldung RSS Feed");
        feed.setDescription("Learn how to program in Java");
        feed.setLink("http://www.baeldung.com");
    }
 
    @Override
    protected List<Item> buildFeedItems(Map<String, Object> model, 
      HttpServletRequest request, HttpServletResponse response) {
        Item entryOne = new Item();
        entryOne.setTitle("JUnit 5 @Test Annotation");
        entryOne.setAuthor("donatohan.rimenti@gmail.com");
        entryOne.setLink("http://www.baeldung.com/junit-5-test-annotation");
        entryOne.setPubDate(Date.from(Instant.parse("2017-12-19T00:00:00Z")));
        return Arrays.asList(entryOne);
    }
}