package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
		criaEventosAux();
        return redirect(routes.Application.hacks());
    }
	
	private static void criaEventosAux(){
		String[] eventosTitle = {"Inovando as Práticas de Software", "Persistencia de dados",
				"Geração de casos de teste automáticos", "O mundo do Hardware", "Windows e ...", 
				"The best of the world!", "Inovando na sua empresa", "Mais produção, menos trabalho",
				"A mágica do PLAY", "O mundo dos grafos"};
		String[] nomes = {"josé", "Pedro", "Thiago", "Felipe", "nunes", "Geraldo", "Wesley", "Nunes"};
		String[] temas = {"Engenharia de Software","Inteligência Artificial", "Grafos", "Algoritmos",
				"Música", "Criptografia"};
		EventHack event;
		Random gerador = new Random();
		String[] descri = {"A cada dia a tecnologia está em avanço e a área de software não pode ficar atrás, "
				+ "e o estudo de novas práticas de software é de suma importância para esse crescimento.",
				"O mundo da persistencia de dados é amplo e vamos tentar desvendá-lo em poucos minutos.",
				"Vamos discutir um pouco sobre a GCTA para facilitar nossa vida como testadores.",
				"Um mundo em que é o mais importante, pois o software é dependente dele e assim vamos nos aprofundar no que há de novo na área",
				"Vamos mostrar todos os BUGS que o Windows tem até hoje.", "The best of the best of the world",
				"Implementando BPM na sua empresa. mostraremos todos o ciclo de vida da BPM",
				"Discutiremos técnica de trabalho para melhorar a produção da sua empresa",
				"Vamos desvendar o seu funcionamento de forma aprofundada e em paralelo com H2", "Estudo de problemas envolvendo o mundo dos grafos"};
		for (int i = 0; i < eventosTitle.length; i++) {
			event = new EventHack();
			event.setTitleHack(eventosTitle[i]);
			event.setDate("2014-"+(gerador.nextInt(12)+1)+"-"+(gerador.nextInt(31)+1));
			if (i == 1 || i == 3 || i == 7) {
				for (int j = 0; j < 7; j++) {
					String nome = nomes[gerador.nextInt(8)]+" "+nomes[gerador.nextInt(8)]+" "+nomes[gerador.nextInt(8)];
					event.addParticipantes(new User(nome, nome+"@gmail.com"));
				}	
			}
			for (int j = 0; j < 2; j++) {
				event.addAssociated(temas[gerador.nextInt(6)]);				
			}
			event.setDescription(descri[i]);
			dao.persist(event);
			dao.flush();				
		}
		
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
		EventHack eventAux = form.get();
		associatedTemp = eventAux.getAssociated();
		
		dao.persist(eventAux);
		dao.flush();
		return redirect(routes.Application.hacks());
		
	}
    
    
    

}
