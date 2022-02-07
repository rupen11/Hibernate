package com.tut;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	private String Course;
	private String duration;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Certificate(String course, String duration) {
		super();
		Course = course;
		this.duration = duration;
	}
	
	
	public String getCourse() {
		return Course;
	}
	
	public void setCourse(String course) {
		Course = course;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
//	Print certicate
	public String toString() {
		return this.getCourse() + ":" + this.getDuration();
	}
	
}
