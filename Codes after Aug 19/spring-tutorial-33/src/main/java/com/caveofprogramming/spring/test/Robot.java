package com.caveofprogramming.spring.test;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private int id = 0;
	private String speech = "hello";
	
	public void speak(){
		System.out.println(id+ ": " + speech);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}
	
}
