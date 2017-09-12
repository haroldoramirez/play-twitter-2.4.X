package controllers;

import com.fizzed.play.twitter.MyComponent;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class Application extends Controller {


    private MyComponent myComponent;

    @Inject
    public Application(MyComponent myComponent) {

        this.myComponent = myComponent;
    }

    //public MyComponent TWITTER_PLUGIN = Play.application().plugin(MyComponent.class);

    public Result index() {
        return ok(views.html.index.render(myComponent.tweets()));
    }

//    public MyComponent twitter() {
//        return TWITTER_PLUGIN;
//    }

}
