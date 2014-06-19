package controllers;

import models.DAOEvent;
import models.EventHack;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	
	private static DAOEvent dao = new DAOEvent();
	static Form<EventHack> hackForm = Form.form(EventHack.class);

    public static Result index() {
        return redirect(routes.Application.hacks());
    }
    
    public static Result hacks(){
    	return ok(index.render(dao.all(),hackForm));
    }
    
    
    

}
