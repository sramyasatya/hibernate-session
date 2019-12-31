package com.ramya.bean;

import java.util.List;
import java.util.ArrayList;

import com.ramya.bean.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Event {
	
	@Id
	@Column(name="event_id")
	private int eventId;
	
	@Column(name="event_name")
	private String eventName;
	
	@ManyToMany
	@JoinTable(name="Join_Delegate_Event",
	joinColumns= {@JoinColumn(name="event_id")},
	inverseJoinColumns= {@JoinColumn(name="delegate_id")})
	private List<Delegate> delegate=new ArrayList<Delegate>();
	
	//constructors
	public Event() {
	}
	public Event(int eventId, String eventName, List<Delegate> delegate) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.delegate = delegate;
	}
	
	

	public int getEventId() {
		return eventId;
	}
	
	
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public List<Delegate> getDelegate() {
		return delegate;
	}
	public void setDelegate(List<Delegate> delegate) {
		this.delegate = delegate;
	}
	
	

}
