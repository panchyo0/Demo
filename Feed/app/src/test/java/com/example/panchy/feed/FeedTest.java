package com.example.panchy.feed;


import com.example.panchy.feed.bean.Body;
import com.example.panchy.feed.bean.Feed;

import junit.framework.TestCase;

import org.junit.Test;

import java.util.ArrayList;


public class FeedTest extends TestCase {

    @Test
    public void testSetId(){
        Feed feed=new Feed();
        feed.setId(1);
        feed.setId(2);
        assertEquals(feed.getId(),2);
    }

    @Test
    public void testGetId(){
        Feed feed=new Feed();
        feed.setId(1);
        assertEquals(feed.getId(),1);
    }

    @Test
    public void testSetUsername(){
        Feed feed=new Feed();
        feed.setUsername("Tom");
        feed.setUsername("Joy");
        assertEquals(feed.getUsername(),"Joy");
    }

    @Test
    public void testGetUsername(){
        Feed feed=new Feed();
        feed.setUsername("tom");
        assertEquals(feed.getUsername(),"tom");
    }

    @Test
    public void testSetBody(){
        Feed feed=new Feed();
        Body body=new Body();
        ArrayList arrayList=new ArrayList();
        arrayList.add(body);
        feed.setBody(arrayList);
        assertEquals(feed.getBody().size(),1);
    }

    @Test
    public void testGetBody(){
        Feed feed=new Feed();
        assertEquals(feed.getBody().size(),0);
    }
}
