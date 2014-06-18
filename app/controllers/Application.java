package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return redirect(routes.Application.hacks());
    }
    
    public static Result hacks(){
    	return ok(index.render("sd"));
    }
    
    
    

}
