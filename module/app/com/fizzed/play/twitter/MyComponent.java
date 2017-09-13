package com.fizzed.play.twitter;

import com.fasterxml.jackson.databind.JsonNode;
import twitter4j.Status;

import java.util.List;

public interface MyComponent {
    List<Status> tweets();
    JsonNode tweetsJson();
}
