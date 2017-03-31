package com.aixigo.example.entity;

/**
 * @author Iryna Feuerstein, PRODYNA AG
 *
 */
public class User {
	
	private final long id;
	private final String name;
	
	public User(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
