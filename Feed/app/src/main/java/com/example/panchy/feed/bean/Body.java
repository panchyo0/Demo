package com.example.panchy.feed.bean;

/**
 * Created by Panchy on 2018/4/23.
 */

public class Body {
    private int id;
    private String bodyType;
    private String text;
    private String mediaLocation;

    //constructor by default Feed<init>

    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMediaLocation() {
        return mediaLocation;
    }

    public void setMediaLocation(String mediaLocation) {
        this.mediaLocation = mediaLocation;
    }

    //toString

    @Override
    public String toString() {
        if (this.getText()==null){
            return "Body{" +
                    "id=" + id +
                    ", bodyType='" + bodyType + '\'' +
                    ", mediaLocation='" + mediaLocation + '\'' +
                    '}'+"\n";
        }else {
            return "Body{" +
                    "id=" + id +
                    ", bodyType='" + bodyType + '\'' +
                    ", text='" + text + '\'' +
                    '}' + "\n";
        }
    }
}
