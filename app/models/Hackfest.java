package models;

import java.util.ArrayList;
import java.util.List;

public class Hackfest {
	
	
	private List<String> associated = new ArrayList<String>();	
	private List<User> participants = new ArrayList<User>();

	
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

	/**
	 * @return the participants
	 */
	public List<User> getParticipants() {
		return participants;
	}

	/**
	 * @param participants the participants to set
	 */
	public void setParticipants(List<User> participants) {
		this.participants = participants;
	}
	
	
	

}
