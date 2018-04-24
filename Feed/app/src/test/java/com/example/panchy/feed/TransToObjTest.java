package com.example.panchy.feed;


import com.example.panchy.feed.bean.Body;
import com.example.panchy.feed.bean.Feed;

import junit.framework.TestCase;


import org.junit.Test;

import java.util.ArrayList;

import static com.example.panchy.feed.TransToObj.getObjList;

public class TransToObjTest extends TestCase {

    // test for empty json array first
    @Test
    public void testGetObjListEmpty() throws Exception {
        String json="[]";
        ArrayList arrayList=new ArrayList();
        assertEquals(getObjList(json),arrayList);
    }

    //Test for unexpected json string. Should catch an exception
    @Test
    public void testGetObjListUnexpected(){
        try {
            String json="[q]";
            ArrayList<Feed> arrayList=getObjList(json);
            fail("Should throw an exception");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    //Test After translate json Array to obj array
    @Test
    public void testGetObjList() throws Exception {
        String json="[ {\"id\":1," +
                "\"username\":\"test1 user\"," +
                " \"body\":[{ \"id\":3," +
                "\"bodyType\":\"text\"," +
                "\"text\":\"Hello World\"}," +
                "{ \"id\":4," +
                "\"bodyType\":\"image\"," +
                "\"mediaLocation\":\" http://.../\"}]}," +
                "{\"id\":2," +
                "\"username\":\"test2 user\"," +
                "\"body\":[{ \"id\":4," +
                "\"bodyType\":\"video\"," +
                "\"mediaLocation\":\"http://.../\"}]" +
                "}]";
        ArrayList<Feed> arrayList=getObjList(json);
        Feed feed=arrayList.get(0);
        Body body=feed.getBody().get(0);

        //test return array size
        assertEquals(arrayList.size(),2);

        //test for feed id after translate
        assertEquals(feed.getId(),1);

        //test for body id after translate
        assertEquals(body.getId(),3);

        // test for feed class after translate
        assertEquals(arrayList.get(0).getClass().toString(),"class com.example.panchy.feed.bean.Feed");

        //test body class after translate
        assertEquals(arrayList.get(1).getBody().get(0).getClass().toString(),"class com.example.panchy.feed.bean.Body");

    }

}
