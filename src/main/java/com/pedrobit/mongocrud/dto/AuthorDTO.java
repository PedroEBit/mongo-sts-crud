package com.pedrobit.mongocrud.dto;

import java.io.Serializable;

import com.pedrobit.mongocrud.domain.User;

public class AuthorDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AuthorDTO() {}
	
	public AuthorDTO(User user) {
		id = user.getId();
		name = user.getName();
	}
}
