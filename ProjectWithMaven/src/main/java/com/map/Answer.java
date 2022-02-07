package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

//Mapped By Property Indicate that only answer_'s Id can join quetion table and Quetion's id can not join with answer table
//Many to One:- Many answer have One quetion

@Entity
public class Answer {

//	=======================================One to one========================================
//	@Id
//	@Column(name="answer_id")
//	private int answerId;
//	private String answer;
//	
//	@OneToOne(mappedBy = "answer") 
//	private Question question;
//	
//	
//	public Answer(int answerId, String answer) {
//		super();
//		this.answerId = answerId;
//		this.answer = answer;
//	}
//	
//
//	public Answer() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//
//	public Question getQuestion() {
//		return question;
//	}
//
//	public void setQuestion(Question question) {
//		this.question = question;
//	}
//	
//	public int getAnswerId() {
//		return answerId;
//	}
//	
//	public void setAnswerId(int answerId) {
//		this.answerId = answerId;
//	}
//	
//	public String getAnswer() {
//		return answer;
//	}
//	
//	public void setAnswer(String answer) {
//		this.answer = answer;
//	}

//	=======================================END One to one========================================
	
	
	
	

//	=======================================One to many========================================
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	
	@ManyToOne
	private Question question;
	
	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
	

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	public int getAnswerId() {
		return answerId;
	}
	
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}

//	=======================================END One to many========================================
}
