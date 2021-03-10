package com.codepath.apps.restclienttemplate.models;

import android.util.JsonReader;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class User {
    public String name;
    public String screenName;
    public String profileImageUrl;

    public User() {}

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.screenName = jsonObject.getString("name");
        user.profileImageUrl = jsonObject.getString("profile_image_url_https");
        return user;
    }
}
