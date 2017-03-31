package com.aixigo.example.entity;

/**
 * @author Iryna Feuerstein, PRODYNA AG
 *
 */
public class Policy {
	
	private long id;
	private long userId;
	private String policyContent;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getPolicyContent() {
		return policyContent;
	}
	public void setPolicyContent(String policyContent) {
		this.policyContent = policyContent;
	}
	
	

}
