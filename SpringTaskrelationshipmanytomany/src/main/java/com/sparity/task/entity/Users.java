package com.sparity.task.entity;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String username;
	private String password;
	@ManyToMany(fetch = FetchType.LAZY,
		      cascade = {
		              CascadeType.PERSIST,
		              CascadeType.MERGE
		          })
	@JoinTable(name="users_roles",joinColumns =@JoinColumn(name="user_id",referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="roles_id",referencedColumnName = "id"))
			
	private List<Role> roles;
	public Users() {
		
	}
	public Users( String username, String password, List<Role> roles) {
		
		this.username = username;
		this.password = password;
		this.roles = roles;
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
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
	
}
