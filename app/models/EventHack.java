package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import play.data.validation.Constraints.Required;

@Entity
public class EventHack {
	
	@Id
	@SequenceGenerator(name = "META_SEQUENCE", sequenceName = "META_SEQUENCE", allocationSize = 1, initialValue = 0)
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	@Required
	private String titleHack;
	
	@Required
	private String description;
	
	@Required
	private String date;
	
	// Relação Muitos para Muitos
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
	private List<String> associated;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
	private List<Long> participantes;

	/**
	 * @return the associated
	 */
	public List<String> getAssociated() {
		return associated;
	}

	/**
	 * @param associated the associated to set
	 */
	public void setAssociated(List<String> associated) {
		this.associated = associated;
	}
	
	public void addAssociated(String valor){
		associated.add(valor);
	}

	/**
	 * @return the participantes
	 */
	public List<Long> getParticipantes() {
		return participantes;
	}

	/**
	 * @param participantes the participantes to set
	 */
	public void setParticipantes(List<Long> participantes) {
		this.participantes = participantes;
	}
	
	public void addParticipantes(Long user){
		participantes.add(user);
	}

	/**
	 * @return the titleHack
	 */
	public String getTitleHack() {
		return titleHack;
	}

	/**
	 * @param titleHack the titleHack to set
	 */
	public void setTitleHack(String titleHack) {
		this.titleHack = titleHack;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	
	

}
