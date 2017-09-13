package com.fizzed.play.twitter;

import twitter4j.Status;

import java.util.List;

public class EnvelopeTweet {

    private List<Status> tweets;

    public EnvelopeTweet(List<Status> tweets) {
        this.tweets = tweets;
    }

    public List<Status> getTweets() {
        return tweets;
    }
}
