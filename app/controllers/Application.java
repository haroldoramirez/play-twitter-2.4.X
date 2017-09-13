package controllers;

import com.fizzed.play.twitter.MyComponent;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class Application extends Controller {


    private MyComponent myComponent;

    @Inject
    public Application(MyComponent myComponent) {

        this.myComponent = myComponent;
    }

    public Result index() {
        return ok(views.html.index.render(myComponent.tweets()));
    }

    public Result twitterJson() {
        return ok(Json.toJson(myComponent.tweetsJson()));
    }


}
