package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import play.db.jpa.JPA;

public class DAOEvent {
	
	public void persist(EventHack event){
		JPA.em().persist(event);
	}
	
	public void flush(){
		JPA.em().flush();
	}
	
	public void merge(EventHack event){
		JPA.em().merge(event);
	}
	
	public List<EventHack> all() {
		String hql = "FROM EventHack ORDER BY id";
		Query hqlQuery = JPA.em().createQuery(hql);
		return hqlQuery.getResultList();
	}
	
	public Query createQuery(String query){
		return JPA.em().createQuery(query);
	}
	
	
	public void delete(Long id) {
		JPA.em().remove(findByEntityId(id));
	}
	
	public EventHack findByEntityId(Long id) {
		return JPA.em().find(EventHack.class, id);
	}

}
