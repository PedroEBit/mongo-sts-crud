package com.pedrobit.mongocrud.dto;

import java.io.Serializable;

import com.pedrobit.mongocrud.domain.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO() {		
	}
	
	/**
	 * estou instanciando três variáveis, poderiam ser menos.
	 * varia de acordo com como você quer seu objeto retornado
	 * @param obj user recebido pelo dto
	 */
	public UserDTO(User user) {
		id = user.getId();
		name = user.getName();
		email = user.getEmail();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
