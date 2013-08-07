package controllers;

import org.springframework.stereotype.*;
import play.*;
import play.mvc.*;

import play.mvc.Controller;
import views.html.*;

@org.springframework.stereotype.Controller
public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
  
}
