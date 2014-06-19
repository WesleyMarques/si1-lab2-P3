package controllers;

import java.util.ArrayList;
import java.util.List;

import models.DAOEvent;
import models.EventHack;
import models.User;
import play.*;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	
	private static DAOEvent dao = new DAOEvent();
	static Form<EventHack> eventForm = Form.form(EventHack.class);
	static Form<User> userForm = Form.form(User.class);

	@Transactional
    public static Result index() {
        return redirect(routes.Application.hacks());
    }
    
	@Transactional
    public static Result hacks(){
    	return ok(index.render(dao.all(), eventForm, userForm));
    }
	
	@Transactional
	public static Result addUser(long id){
		Form<User> form = userForm.bindFromRequest();
		if(form.hasErrors()) 
		    return badRequest(views.html.index.render(dao.all(), eventForm, userForm));
		EventHack eventTemp = dao.findByEntityId(id);
		eventTemp.addParticipantes(form.get());
		dao.merge(eventTemp);
		dao.flush();	
		return redirect(routes.Application.hacks());
		
	}
	
	@Transactional
	public static Result newEvent(){
		Form<EventHack> form = eventForm.bindFromRequest();
		if(form.hasErrors()) 
		    return badRequest(views.html.index.render(dao.all(), eventForm, userForm));
		List<String> associatedTemp = new ArrayList<String>();
		dao.persist(form.get());
		dao.flush();
		return redirect(routes.Application.hacks());
		
	}
    
    
    

}
