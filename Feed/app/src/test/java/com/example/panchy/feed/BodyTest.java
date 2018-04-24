package com.example.panchy.feed;


import com.example.panchy.feed.bean.Body;

import junit.framework.TestCase;

import org.junit.Test;

public class BodyTest extends TestCase {

    @Test
    public void testSetId(){
        Body body=new Body();
        body.setId(1);
        body.setId(2);
        assertEquals(body.getId(),2);
    }

    @Test
    public void testGetId(){
        Body body=new Body();
        body.setId(1);
        assertEquals(body.getId(),1);
    }

    @Test
    public void testSetBodyType(){
        Body body=new Body();
        body.setBodyType("text");
        body.setBodyType("video");
        assertEquals(body.getBodyType(),"video");
    }

    @Test
    public void testGetBodyType(){
        Body body=new Body();
        body.setBodyType("text");
        assertEquals(body.getBodyType(),"text");
    }

    @Test
    public void testSetText(){
        Body body=new Body();
        body.setText("text");
        body.setText("video");
        assertEquals(body.getText(),"video");
    }

    @Test
    public void testGetText(){
        Body body=new Body();
        body.setText("text");
        assertEquals(body.getText(),"text");
    }

    @Test
    public void testSetMediaLocation(){
        Body body=new Body();
        body.setMediaLocation("http://.../");
        body.setMediaLocation("http");
        assertEquals(body.getMediaLocation(),"http");
    }

    @Test
    public void testGetMediaLocation(){
        Body body=new Body();
        body.setMediaLocation("http://.../");
        assertEquals(body.getMediaLocation(),"http://.../");
    }


}
