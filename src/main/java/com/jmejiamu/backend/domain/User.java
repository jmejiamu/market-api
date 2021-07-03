package com.jmejiamu.backend.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

	private Long id;
	private String userId;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private String profileImageUrl;
	private Date lastLoginDate;
	private Date getLastLoginDate;
	private Date joinDate;
	private String role;
	private String[] authorities;
	private boolean isActive;
	private boolean isNotLocked;
	
	
	public User() {
		super();
	}


	public User(Long id, String userId, String firstName, String lastName, String username, String password,
			String email, String profileImageUrl, Date lastLoginDate, Date getLastLoginDate, Date joinDate, String role,
			String[] authorities, boolean isActive, boolean isNotLocked) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.profileImageUrl = profileImageUrl;
		this.lastLoginDate = lastLoginDate;
		this.getLastLoginDate = getLastLoginDate;
		this.joinDate = joinDate;
		this.role = role;
		this.authorities = authorities;
		this.isActive = isActive;
		this.isNotLocked = isNotLocked;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getProfileImageUrl() {
		return profileImageUrl;
	}


	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}


	public Date getLastLoginDate() {
		return lastLoginDate;
	}


	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}


	public Date getGetLastLoginDate() {
		return getLastLoginDate;
	}


	public void setGetLastLoginDate(Date getLastLoginDate) {
		this.getLastLoginDate = getLastLoginDate;
	}


	public Date getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String[] getAuthorities() {
		return authorities;
	}


	public void setAuthorities(String[] authorities) {
		this.authorities = authorities;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public boolean isNotLocked() {
		return isNotLocked;
	}


	public void setNotLocked(boolean isNotLocked) {
		this.isNotLocked = isNotLocked;
	}
	
	
	
	
	
}
