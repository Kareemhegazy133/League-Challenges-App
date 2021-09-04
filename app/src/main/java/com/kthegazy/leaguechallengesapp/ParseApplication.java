package com.kthegazy.leaguechallengesapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Jnu7OW7MGbgoztQFESL7d2DvUlMbcThQg27qHOSv")
                .clientKey("pNGAjlkjgU93JqHBqXEG9YpKu3CSi7WTTVv8B7lZ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
