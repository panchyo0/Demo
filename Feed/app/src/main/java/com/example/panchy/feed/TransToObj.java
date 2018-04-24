package com.example.panchy.feed;



import com.example.panchy.feed.bean.Body;
import com.example.panchy.feed.bean.Feed;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;


/**
 * Created by Panchy on 2018/4/23.
 */

public class TransToObj {

    //get feed
    public static String getFeed(){
        return "[ {\"id\":1," +
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
    }

    // parse json response from the backend into objects
    public static ArrayList getObjList(String json) throws Exception {
        ArrayList<Feed> FeedItem=new ArrayList<Feed>();
        try {
            // translate to JSONArray
            JSONArray jsonArray= JSONArray.fromObject(json);
            int lenArray=jsonArray.size();

            //translate json to feed object
            for (int i=0;i<lenArray;i++){
                Object o=jsonArray.get(i);
                JSONObject feedObject= JSONObject.fromObject(o);
                Feed feed=(Feed) JSONObject.toBean(feedObject, Feed.class);
                ArrayList<Body> bodyArrayList=new ArrayList<Body>();

                // get body list of each feed obj and translate them to body obj
                int lenBody=feed.getBody().size();
                for (int j=0;j<lenBody;j++){
                    JSONObject bodyObject=JSONObject.fromObject(feed.getBody().get(j));
                    Body body=(Body) JSONObject.toBean(bodyObject, Body.class);
                    bodyArrayList.add(body);
                }
                //feed update body list and add feed to feed array list
                feed.setBody(bodyArrayList);
                FeedItem.add(feed);
            }
        }catch (Exception e){
            System.out.println(e);
            throw new Exception("exception happened.");
        }
        return FeedItem;
    }

    //display feed (can use adapter to dynamic update UI)
    public static void displayFeed(ArrayList<Feed> FeedItem){
        System.out.println(FeedItem);
    }


    //main: get data from backend by getFeed()
    //      translate json to Feed object by getObjList and return an Arraylist of Feed
    //      display Feed to screen by display Feed.
    public static void main(String[] args) throws Exception {
        String json=getFeed();
        ArrayList<Feed> arrayList=getObjList(json);
        displayFeed(arrayList);
    }
}
