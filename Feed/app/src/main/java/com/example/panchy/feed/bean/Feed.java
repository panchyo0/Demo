package com.example.panchy.feed.bean;

import java.util.ArrayList;

/**
 * Created by Panchy on 2018/4/23.
 */

public class Feed {
    private int id;
    private String username;
    private ArrayList<Body> body=new ArrayList<Body>();

    //constructor by default Feed<init>

    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Body> getBody() {
        return body;
    }

    public void setBody(ArrayList<Body> body) {
        this.body = body;
    }

    //toString

    @Override
    public String toString() {
        return "Feed{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", body=" + body +
                '}'+"\n";
    }


}